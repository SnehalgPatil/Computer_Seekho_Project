using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace DotNetComputerSekho.Migrations
{
    /// <inheritdoc />
    public partial class Modify : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Batch_Course_course_id1",
                table: "Batch");

            migrationBuilder.DropIndex(
                name: "IX_Batch_course_id1",
                table: "Batch");

            migrationBuilder.DropColumn(
                name: "course_id1",
                table: "Batch");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<int>(
                name: "course_id1",
                table: "Batch",
                type: "int",
                nullable: true);

            migrationBuilder.CreateIndex(
                name: "IX_Batch_course_id1",
                table: "Batch",
                column: "course_id1");

            migrationBuilder.AddForeignKey(
                name: "FK_Batch_Course_course_id1",
                table: "Batch",
                column: "course_id1",
                principalTable: "Course",
                principalColumn: "course_id");
        }
    }
}
