using System.ComponentModel.DataAnnotations;

namespace Iva
{
    public class Usuario
    {
        [Key]
        public int Id { get; set; }

        [Required(ErrorMessage = "O nome do usuário é obrigatório")]
        public string Nome { get; set; }

        [Required(ErrorMessage = "O email do usuário é obrigatório")]
        public string Email { get; set; }

        [Required(ErrorMessage = "A senha do usuário é obrigatória")]
        public string Senha { get; set; }
    }
}
