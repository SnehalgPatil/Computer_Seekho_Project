using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace DotNetComputerSekho.Migrations
{
    /// <inheritdoc />
    public partial class batch : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.RenameColumn(
                name: "batch_start_time",
                table: "Batch",
                newName: "batch_start_date");

            migrationBuilder.RenameColumn(
                name: "batch_end_time",
                table: "Batch",
                newName: "batch_end_date");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.RenameColumn(
                name: "batch_start_date",
                table: "Batch",
                newName: "batch_start_time");

            migrationBuilder.RenameColumn(
                name: "batch_end_date",
                table: "Batch",
                newName: "batch_end_time");
        }
    }
}
