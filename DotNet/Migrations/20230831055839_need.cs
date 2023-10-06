using System;
using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace DotNetComputerSekho.Migrations
{
    /// <inheritdoc />
    public partial class need : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropPrimaryKey(
                name: "PK_Placements",
                table: "Placements");

            migrationBuilder.RenameTable(
                name: "Placements",
                newName: "Placement");

            migrationBuilder.AddPrimaryKey(
                name: "PK_Placement",
                table: "Placement",
                column: "placemetid");

            migrationBuilder.CreateTable(
                name: "Course",
                columns: table => new
                {
                    course_id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    course_name = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    course_description = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    course_duration = table.Column<int>(type: "int", nullable: false),
                    course_syllabus = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    age_grp_type = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    course_is_active = table.Column<bool>(type: "bit", nullable: false),
                    cover_photo = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    video_id = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Course", x => x.course_id);
                });

            migrationBuilder.CreateTable(
                name: "Batch",
                columns: table => new
                {
                    batch_id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    batch_name = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    batch_start_time = table.Column<DateTime>(type: "date", nullable: false),
                    batch_end_time = table.Column<DateTime>(type: "date", nullable: false),
                    final_presentation_date = table.Column<DateTime>(type: "date", nullable: false),
                    batch_fees = table.Column<decimal>(type: "decimal(10,2)", nullable: true),
                    course_id = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Batch", x => x.batch_id);
                    table.ForeignKey(
                        name: "FK_Batch_Course_course_id",
                        column: x => x.course_id,
                        principalTable: "Course",
                        principalColumn: "course_id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "Student",
                columns: table => new
                {
                    student_id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    student_name = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    student_address = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    student_gender = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    student_dob = table.Column<DateTime>(type: "date", nullable: false),
                    student_qualification = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    student_mobile = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    batch_id = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Student", x => x.student_id);
                    table.ForeignKey(
                        name: "FK_Student_Batch_batch_id",
                        column: x => x.batch_id,
                        principalTable: "Batch",
                        principalColumn: "batch_id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateIndex(
                name: "IX_Batch_course_id",
                table: "Batch",
                column: "course_id");

            migrationBuilder.CreateIndex(
                name: "IX_Student_batch_id",
                table: "Student",
                column: "batch_id");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "Student");

            migrationBuilder.DropTable(
                name: "Batch");

            migrationBuilder.DropTable(
                name: "Course");

            migrationBuilder.DropPrimaryKey(
                name: "PK_Placement",
                table: "Placement");

            migrationBuilder.RenameTable(
                name: "Placement",
                newName: "Placements");

            migrationBuilder.AddPrimaryKey(
                name: "PK_Placements",
                table: "Placements",
                column: "placemetid");
        }
    }
}
