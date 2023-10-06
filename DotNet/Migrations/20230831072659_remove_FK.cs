using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace DotNetComputerSekho.Migrations
{
    /// <inheritdoc />
    public partial class remove_FK : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Batch_Course_course_id",
                table: "Batch");

            migrationBuilder.RenameColumn(
                name: "course_id",
                table: "Batch",
                newName: "CourseId");

            migrationBuilder.RenameIndex(
                name: "IX_Batch_course_id",
                table: "Batch",
                newName: "IX_Batch_CourseId");

            migrationBuilder.AddForeignKey(
                name: "FK_Batch_Course_CourseId",
                table: "Batch",
                column: "CourseId",
                principalTable: "Course",
                principalColumn: "course_id",
                onDelete: ReferentialAction.Cascade);
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Batch_Course_CourseId",
                table: "Batch");

            migrationBuilder.RenameColumn(
                name: "CourseId",
                table: "Batch",
                newName: "course_id");

            migrationBuilder.RenameIndex(
                name: "IX_Batch_CourseId",
                table: "Batch",
                newName: "IX_Batch_course_id");

            migrationBuilder.AddForeignKey(
                name: "FK_Batch_Course_course_id",
                table: "Batch",
                column: "course_id",
                principalTable: "Course",
                principalColumn: "course_id",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
