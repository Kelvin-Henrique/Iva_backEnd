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
    }
}
