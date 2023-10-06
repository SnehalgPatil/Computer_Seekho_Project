namespace DotNetComputerSekho.Models
{
    using System.Collections.Generic;

    public class SQLBatchRepository : IBatchRepository
    {
        private readonly AppDBcontext _context;

        public SQLBatchRepository(AppDBcontext context)
        {
            _context = context;
        }

       

        public void SaveBatch(Batch batch)
        {
            _context.Batch.Add(batch);
            _context.SaveChanges();
        }

        public List<Batch> GetAllBatches()
        {
            return _context.Batch.ToList();
        }

      

        public List<Batch> GetUpcomingBatches()
        {
            DateTime currentDate = DateTime.Today;

            return _context.Batch
                .Where(b => b.batch_start_date > currentDate)
                .ToList();
        }

        public List<Batch> GetCurrentBatches()
        {
            DateTime currentDate = DateTime.Today;

            return _context.Batch
                .Where(b => currentDate >= b.batch_start_date && currentDate <= b.batch_end_date)
                .ToList();
        }

        public List<Batch> GetPastBatches()
        {

            DateTime currentDate = DateTime.Today;

            return _context.Batch
                .Where(b => currentDate >= b.batch_end_date)
                .ToList();
        }

        public List<Batch> GetBatchesByBatchName(string batchName)
        {
            return _context.Batch.Where(b => b.batch_name == batchName).ToList();
        }

        public List<Batch> GetBatchesByCourseId(int courseId)
        {
            return _context.Batch.Where(b => b.course_id == courseId).ToList();
        }

        public List<Batch> GetBatchByBatchNo(int batchNo)
        {
            return _context.Batch.Where(b=> b.batch_id==batchNo).ToList();  
        }
    }

}
