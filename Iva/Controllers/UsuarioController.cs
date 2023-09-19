using Iva.Data;
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
        public IActionResult AdicionarUsuario([FromBody] Usuario usuario)
        {
            _context.Add(usuario);
            _context.SaveChanges();
            return Ok(); 
        }





    }
}