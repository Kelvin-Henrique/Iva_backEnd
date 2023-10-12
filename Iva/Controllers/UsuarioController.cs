using Iva.Data;
using Iva.Models;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;

namespace Iva.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class UsuarioController : ControllerBase
    {
        private IvaContext _context;

        public UsuarioController(IvaContext context)
        {
            _context = context;
        }

        [HttpPost]
        [Route("cadastrar")]
        [AllowAnonymous]
        public IActionResult AdicionarUsuario([FromBody] Usuario usuario)
        {
            if (!ModelState.IsValid)
            {
                return BadRequest(ModelState);
            }

            _context.Add(usuario);
            _context.SaveChanges();
            return Ok(); 
        }

        [HttpPost]
        [Route("login")]
        [AllowAnonymous]
        public IActionResult Login([FromBody] LoginModel loginModel)
        {
            var user = _context.Usuarios.FirstOrDefault(u => u.Email == loginModel.Email);

            if (user != null)
            {
                if (user.Senha == loginModel.Password)
                {
                    return Ok();
                }
            }

            return BadRequest("Falha no login.");
        }


    }
}