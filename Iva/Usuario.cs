using System.ComponentModel.DataAnnotations;

namespace Iva
{
    public class Usuario
    {
        [Key]
        [Required(ErrorMessage = "O nome do usuario é obrigatório")]
        public string Nome { get; set; }
        [Required(ErrorMessage = "O email do usuario é obrigatório")]
        public string Email { get; set; }
        [Required(ErrorMessage = "O numero de celular do usuario é obrigatório")]
        public string Celular { get; set; }
        [Required(ErrorMessage = "A senha do usuario é obrigatório")]
        public string Senha { get; set;}
    }
}