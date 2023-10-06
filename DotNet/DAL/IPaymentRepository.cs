using DotNetComputerSekho.Entities;
using Microsoft.AspNetCore.Mvc;

namespace DotNetComputerSekho.DAL
{
    public interface IPaymentRepository
    {
        Task<Payment> GetByIdAsync(int payment_id);
        Task<IEnumerable<Payment>> GetAllAsync();
        Task<IEnumerable<Payment>> GetByStudentIdAsync(int student_id);
        Task AddAsync(Payment payment);
        Task UpdateAsync(Payment payment);
        Task DeleteAsync(int payment_id);

    }
}
