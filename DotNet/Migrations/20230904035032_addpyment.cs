using System;
using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace DotNetComputerSekho.Migrations
{
    /// <inheritdoc />
    public partial class addpyment : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<int>(
                name: "enquiry_id",
                table: "Student",
                type: "int",
                nullable: false,
                defaultValue: 0);

            migrationBuilder.AddColumn<string>(
                name: "student_email",
                table: "Student",
                type: "nvarchar(max)",
                nullable: true);

            migrationBuilder.CreateTable(
                name: "Payment",
                columns: table => new
                {
                    payment_id = table.Column<int>(type: "int", nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    payment_transaction_id = table.Column<string>(type: "nvarchar(max)", nullable: true),
                    payment_date = table.Column<DateTime>(type: "datetime2", nullable: false),
                    payment_done = table.Column<bool>(type: "bit", nullable: false),
                    batch_fees = table.Column<double>(type: "float", nullable: true),
                    fees_paid = table.Column<double>(type: "float", nullable: true),
                    student_id = table.Column<int>(type: "int", nullable: false),
                    remaining_fees = table.Column<double>(type: "float", nullable: true),
                    payment_Mode = table.Column<string>(type: "nvarchar(max)", nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Payment", x => x.payment_id);
                });
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "Payment");

            migrationBuilder.DropColumn(
                name: "enquiry_id",
                table: "Student");

            migrationBuilder.DropColumn(
                name: "student_email",
                table: "Student");
        }
    }
}
