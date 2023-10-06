using System;
using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace DotNetComputerSekho.Migrations
{
    /// <inheritdoc />
    public partial class add_course : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Batch_Course_CourseId",
                table: "Batch");

            migrationBuilder.DropIndex(
                name: "IX_Batch_CourseId",
                table: "Batch");

            migrationBuilder.DropColumn(
                name: "video_id",
                table: "Course");

            migrationBuilder.RenameColumn(
                name: "CourseId",
                table: "Batch",
                newName: "course_id");

            migrationBuilder.AlterColumn<DateTime>(
                name: "final_presentation_date",
                table: "Batch",
                type: "datetime2",
                nullable: true,
                oldClrType: typeof(DateTime),
                oldType: "date",
                oldNullable: true);

            migrationBuilder.AlterColumn<DateTime>(
                name: "batch_start_time",
                table: "Batch",
                type: "datetime2",
                nullable: true,
                oldClrType: typeof(DateTime),
                oldType: "date",
                oldNullable: true);

            migrationBuilder.AlterColumn<decimal>(
                name: "batch_fees",
                table: "Batch",
                type: "decimal(18,2)",
                nullable: true,
                oldClrType: typeof(decimal),
                oldType: "decimal(10,2)",
                oldNullable: true);

            migrationBuilder.AlterColumn<DateTime>(
                name: "batch_end_time",
                table: "Batch",
                type: "datetime2",
                nullable: true,
                oldClrType: typeof(DateTime),
                oldType: "date",
                oldNullable: true);

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

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
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

            migrationBuilder.RenameColumn(
                name: "course_id",
                table: "Batch",
                newName: "CourseId");

            migrationBuilder.AddColumn<int>(
                name: "video_id",
                table: "Course",
                type: "int",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.AlterColumn<DateTime>(
                name: "final_presentation_date",
                table: "Batch",
                type: "date",
                nullable: true,
                oldClrType: typeof(DateTime),
                oldType: "datetime2",
                oldNullable: true);

            migrationBuilder.AlterColumn<DateTime>(
                name: "batch_start_time",
                table: "Batch",
                type: "date",
                nullable: true,
                oldClrType: typeof(DateTime),
                oldType: "datetime2",
                oldNullable: true);

            migrationBuilder.AlterColumn<decimal>(
                name: "batch_fees",
                table: "Batch",
                type: "decimal(10,2)",
                nullable: true,
                oldClrType: typeof(decimal),
                oldType: "decimal(18,2)",
                oldNullable: true);

            migrationBuilder.AlterColumn<DateTime>(
                name: "batch_end_time",
                table: "Batch",
                type: "date",
                nullable: true,
                oldClrType: typeof(DateTime),
                oldType: "datetime2",
                oldNullable: true);

            migrationBuilder.CreateIndex(
                name: "IX_Batch_CourseId",
                table: "Batch",
                column: "CourseId");

            migrationBuilder.AddForeignKey(
                name: "FK_Batch_Course_CourseId",
                table: "Batch",
                column: "CourseId",
                principalTable: "Course",
                principalColumn: "course_id",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
