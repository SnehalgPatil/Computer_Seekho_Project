using DotNetComputerSekho.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.CodeAnalysis;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace Group11dotnet.Models
{
    



    public class SQLStudentRepository : IStudentRepository
    {
        private readonly AppDBcontext dbContext;

        public SQLStudentRepository(AppDBcontext context)
        {
            this.dbContext = context;
        }

        public async Task<ActionResult<Student>> Add(Student student)
        {
            dbContext.Student.Add(student);
            await dbContext.SaveChangesAsync();
            return student;
        }

        public async Task<Student> Delete(int Id)
        {
            Student student = dbContext.Student.Find(Id);
            if (student != null)
            {
                dbContext.Student.Remove(student);
                await dbContext.SaveChangesAsync();
            }
            return student;
        }

        public async Task<ActionResult<IEnumerable<Student>>> GetAllStudent()
        {
            if (dbContext.Student == null)
            {
                return null;
            }
            return await dbContext.Student.ToListAsync();
        }

        public Optional<Student> getselectbyId(int Id)
        {
            throw new NotImplementedException();
        }

        public Task<Student> Getselected(string name)
        {
            throw new NotImplementedException();
        }

        public async Task<ActionResult<Student>?> GetStudent(int Id)
        {
            if (dbContext.Student == null)
            {
                return null;
            }
            var Students = await dbContext.Student.FindAsync(Id);

            if (Students == null)
            {
                return null;
            }

            return Students;
        }

        public async Task<Student> Update(int id, Student student)
        {
            if (id != student.student_id)
            {
                return null;
            }

            dbContext.Entry(student).State = EntityState.Modified;

            try
            {
                await dbContext.SaveChangesAsync();
            }
            catch (DbUpdateConcurrencyException)
            {
                if (!StudentExists(id))
                {
                    return null;
                }
                else
                {
                    throw;
                }
            }

            return null;
        }

        private bool StudentExists(int id)
        {
            return (dbContext.Student?.Any(e => e.student_id == id)).GetValueOrDefault();
        }


    }

}

