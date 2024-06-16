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
                // Verifica se o usuário existe no banco de dados
                var usuario = await _context.Usuarios.FindAsync(orcamento.UsuarioId);
                if (usuario == null)
                {
                    return BadRequest("Usuário não encontrado");
                }

                // Associa o usuário ao orçamento
                orcamento.Usuario = null; // Limpa a propriedade de navegação para evitar problemas de rastreamento do EF Core
                _context.OrcamentoTb.Add(orcamento);
                await _context.SaveChangesAsync();

                return Ok(orcamento); // Retorna o orçamento cadastrado
            }
            catch (Exception ex)
            {
                return StatusCode(500, $"Erro ao cadastrar orçamento: {ex.Message}");
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