using Microsoft.AspNetCore.Mvc;
using Microsoft.CodeAnalysis;
using Microsoft.CodeAnalysis.Options;

namespace DotNetComputerSekho.Models
{
    public interface IStudentRepository
    {
        Task<ActionResult<Student>?> GetStudent(int Id);
        Task<ActionResult<IEnumerable<Student>>> GetAllStudent();
        Task<ActionResult<Student>> Add(Student student);
        Task<Student> Update(int id, Student student);
        Task<Student> Delete(int Id);
        Task<Student> Getselected(string name);
        Optional<Student> getselectbyId(int Id);
    }
    }

