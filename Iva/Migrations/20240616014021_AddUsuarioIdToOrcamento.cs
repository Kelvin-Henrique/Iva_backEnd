using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace Iva.Migrations
{
    /// <inheritdoc />
    public partial class AddUsuarioIdToOrcamento : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<int>(
                name: "UsuarioId",
                table: "OrcamentoTb",
                type: "int",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.CreateIndex(
                name: "IX_OrcamentoTb_UsuarioId",
                table: "OrcamentoTb",
                column: "UsuarioId");

            migrationBuilder.AddForeignKey(
                name: "FK_OrcamentoTb_Usuarios_UsuarioId",
                table: "OrcamentoTb",
                column: "UsuarioId",
                principalTable: "Usuarios",
                principalColumn: "Id",
                onDelete: ReferentialAction.Cascade);
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_OrcamentoTb_Usuarios_UsuarioId",
                table: "OrcamentoTb");

            migrationBuilder.DropIndex(
                name: "IX_OrcamentoTb_UsuarioId",
                table: "OrcamentoTb");

            migrationBuilder.DropColumn(
                name: "UsuarioId",
                table: "OrcamentoTb");
        }
    }
}
