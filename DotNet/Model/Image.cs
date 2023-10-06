using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace DotNetComputerSekho.Entities
{
    public class Image
    {
        [Key]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        public int image_id { get; set; }
        public string? image_path { get; set; }

        public bool imagage_is_active { get; set; }
        public bool is_album_cover { get; set; }
        public Album album { get; set; }

    }
}
