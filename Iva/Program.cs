using Iva;
using Iva.Data;
using Microsoft.EntityFrameworkCore;

var builder = WebApplication.CreateBuilder(args);

var connectionString = builder.Configuration.GetConnectionString("DefaultConnection");
builder.Services.AddDbContext<IvaContext>(opts => opts.UseMySql(connectionString, ServerVersion.AutoDetect(connectionString)));
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();

var startup = new Startup();
startup.ConfigureServices(builder.Services);

var app = builder.Build();

if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}

startup.Configure(app, app.Environment);

app.Run();
