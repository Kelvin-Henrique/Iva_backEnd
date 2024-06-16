using System;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Iva
{
    public class Orcamento
    {
        [Key]
        public int Id { get; set; }

        [Required(ErrorMessage = "A descrição é obrigatória")]
        public string Descricao { get; set; }

        [Required(ErrorMessage = "O valor é obrigatório")]
        public decimal Valor { get; set; }

        [Required(ErrorMessage = "O tipo é obrigatório")]
        public string Tipo { get; set; }

        [Required(ErrorMessage = "A data é obrigatória")]
        public DateTime Data { get; set; }

        [Required(ErrorMessage = "O usuário é obrigatório")]
        public int UsuarioId { get; set; } // Chave estrangeira

        [ForeignKey("UsuarioId")]
        public Usuario Usuario { get; set; } // Propriedade de navegação para o usuário
    }
}
