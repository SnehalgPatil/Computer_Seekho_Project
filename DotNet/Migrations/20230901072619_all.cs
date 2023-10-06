using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace DotNetComputerSekho.Migrations
{
    /// <inheritdoc />
    public partial class all : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Student_Batch_batch_id",
                table: "Student");

            migrationBuilder.DropIndex(
                name: "IX_Student_batch_id",
                table: "Student");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateIndex(
                name: "IX_Student_batch_id",
                table: "Student",
                column: "batch_id");

            migrationBuilder.AddForeignKey(
                name: "FK_Student_Batch_batch_id",
                table: "Student",
                column: "batch_id",
                principalTable: "Batch",
                principalColumn: "batch_id",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
