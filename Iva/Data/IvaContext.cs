using Microsoft.EntityFrameworkCore;

namespace Iva.Data
{
    public class IvaContext : DbContext
    {
        public IvaContext(DbContextOptions<IvaContext> opts)
            : base(opts)
        {
            
        }

        public DbSet <Usuario> Usuarios { get; set; }
        public DbSet<Orcamento> OrcamentoTb { get; set; }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.Entity<Usuario>()
                .HasKey(u => u.Id);  

            modelBuilder.Entity<Orcamento>()
                .HasKey(o => o.Id);
        }
    }
}
