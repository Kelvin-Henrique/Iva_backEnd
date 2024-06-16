using Iva.Data;
using Iva.Models;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;

namespace Iva.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class OrcamentoController : ControllerBase
    {
        private IvaContext _context;

        public OrcamentoController(IvaContext context)
        {
            _context = context;
        }

        [HttpPost("cadastrar")]
        [AllowAnonymous]
        public async Task<IActionResult> CadastrarOrcamento(Orcamento orcamento)
        {
            try
            {
                var usuario = await _context.Usuarios.FindAsync(orcamento.UsuarioId);
                if (usuario == null)
                {
                    return BadRequest("Usuário não encontrado");
                }

                orcamento.Usuario = null; 
                _context.OrcamentoTb.Add(orcamento);
                await _context.SaveChangesAsync();

                return Ok(orcamento);
            }
            catch (Exception ex)
            {
                return StatusCode(500, $"Erro ao cadastrar orçamento: {ex.Message}");
            }
        }

        [HttpPut("{orcamentoId}")]
        [AllowAnonymous]
        public async Task<IActionResult> AtualizarOrcamento([FromRoute] int orcamentoId, [FromBody] Orcamento orcamentoAtualizado)
        {
            try
            {
                var orcamentoExistente = await _context.OrcamentoTb.FindAsync(orcamentoId);
                if (orcamentoExistente == null)
                {
                    return NotFound("Orçamento não encontrado");
                }

                // Atualize os campos do orçamento existente com os valores do orçamento atualizado
                orcamentoExistente.Descricao = orcamentoAtualizado.Descricao;
                orcamentoExistente.Valor = orcamentoAtualizado.Valor;
                orcamentoExistente.Data = orcamentoAtualizado.Data;
                // Adicione outros campos conforme necessário

                _context.OrcamentoTb.Update(orcamentoExistente);
                await _context.SaveChangesAsync();

                return Ok(orcamentoExistente);
            }
            catch (Exception ex)
            {
                return StatusCode(500, $"Erro ao atualizar orçamento: {ex.Message}");
            }
        }


        [HttpGet]
        [Route("{usuarioId}")]
        [AllowAnonymous]
        public IActionResult ObterOrcamentos([FromRoute] int usuarioId)
        {
            var orcamentos = _context.OrcamentoTb.Where(o => o.UsuarioId == usuarioId);
            return Ok(orcamentos);
        }

        [HttpGet]
        [Route("obter-orcamento/{orcamentoId}")]
        [AllowAnonymous]
        public IActionResult ObterOrcamentosPorId([FromRoute] int orcamentoId)
        {
            var orcamentos = _context.OrcamentoTb.Where(o => o.Id == orcamentoId);
            return Ok(orcamentos);
        }

        [HttpDelete]
        [Route("{orcamentoId}")]
        [AllowAnonymous]
        public async Task<IActionResult> DeletarOrcamento([FromRoute] int orcamentoId)
        {
            var orcamento = await _context.OrcamentoTb.FindAsync(orcamentoId);
            if (orcamento == null)
            {
                return NotFound("Orçamento não encontrado");
            }

            _context.OrcamentoTb.Remove(orcamento);
            await _context.SaveChangesAsync();

            return Ok("Orçamento deletado com sucesso");
        }
    

    }
}