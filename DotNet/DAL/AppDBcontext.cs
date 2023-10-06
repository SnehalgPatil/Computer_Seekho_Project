using DotNetComputerSekho.Entities;
using Microsoft.EntityFrameworkCore;

namespace DotNetComputerSekho.Models
{
    public class AppDBcontext :DbContext
    {
        public AppDBcontext()
        { }
        public AppDBcontext(DbContextOptions<AppDBcontext> options) : base(options) 
        { }
        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            if(!optionsBuilder.IsConfigured)
            {
                optionsBuilder.UseSqlServer(@"Data Source=");
            }
        }
        public DbSet<Enquiry> Enquiry { get; set; }
        public DbSet<Followup> Followup { get; set; }
        public DbSet<Staff> Staff { get; set; }
        public DbSet<Placement> Placement { get; set; }
        public DbSet<Student> Student { get; set; }
        public DbSet<Batch> Batch { get; set; }
        public DbSet<Course> Course { get; set; } 
        public DbSet<Payment> Payment { get; set; } 
    }
}
