using System;
using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace DotNetComputerSekho.Migrations
{
    /// <inheritdoc />
    public partial class put : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "Enquiry",
                columns: table => new
                {
                    enquiry_id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    enquirer_name = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    enquirer_mobile = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    enquirer_email_id = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    enquiry_date = table.Column<DateTime>(type: "datetime2", nullable: false),
                    Follow_up_date = table.Column<DateTime>(type: "datetime2", nullable: false),
                    closure_reason = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    followup_msg = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    enquirer_query = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    enquiry_processed_flag = table.Column<bool>(type: "bit", nullable: true),
                    staff_id = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Enquiry", x => x.enquiry_id);
                });

            migrationBuilder.CreateTable(
                name: "Followup",
                columns: table => new
                {
                    followup_id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    enquiry_id = table.Column<int>(type: "int", nullable: false),
                    staff_id = table.Column<int>(type: "int", nullable: false),
                    followup_msg = table.Column<string>(type: "nvarchar(max)", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Followup", x => x.followup_id);
                });

            migrationBuilder.CreateTable(
                name: "Placements",
                columns: table => new
                {
                    placemetid = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    coursename = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    batchid = table.Column<int>(type: "int", nullable: false),
                    total_student = table.Column<int>(type: "int", nullable: false),
                    placedstudents = table.Column<int>(type: "int", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Placements", x => x.placemetid);
                });

            migrationBuilder.CreateTable(
                name: "Staff",
                columns: table => new
                {
                    staff_id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    staff_name = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    photo_url = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    staff_mobile = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    staff_email = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    staff_username = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    staff_password = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    staff_role = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    staff_isactive = table.Column<bool>(type: "bit", nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Staff", x => x.staff_id);
                });
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "Enquiry");

            migrationBuilder.DropTable(
                name: "Followup");

            migrationBuilder.DropTable(
                name: "Placements");

            migrationBuilder.DropTable(
                name: "Staff");
        }
    }
}
