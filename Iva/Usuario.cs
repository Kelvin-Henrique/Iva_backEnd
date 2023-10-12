using System.ComponentModel.DataAnnotations;

namespace Iva
{
    public class Usuario
    {
        [Key]
        [Required(ErrorMessage = "O nome do usuario � obrigat�rio")]
        public string Nome { get; set; }
        [Required(ErrorMessage = "O email do usuario � obrigat�rio")]
        public string Email { get; set; }
        [Required(ErrorMessage = "O numero de celular do usuario � obrigat�rio")]
        public string Celular { get; set; }
        [Required(ErrorMessage = "A senha do usuario � obrigat�rio")]
        public string Senha { get; set;}
    }
}