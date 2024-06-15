using System.ComponentModel.DataAnnotations;

namespace Iva
{
    public class Usuario
    {
        [Key]
        public int Id { get; set; }

        [Required(ErrorMessage = "O nome do usu�rio � obrigat�rio")]
        public string Nome { get; set; }

        [Required(ErrorMessage = "O email do usu�rio � obrigat�rio")]
        public string Email { get; set; }

        [Required(ErrorMessage = "A senha do usu�rio � obrigat�ria")]
        public string Senha { get; set; }
    }
}
