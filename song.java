 

public class song extends music
{
   private int releaseYear;
   
   public song(String title, int length, int releaseYear) {
       super(title, length);
       this.releaseYear =  releaseYear;
   }
   public int getReleaseYear() {
       return releaseYear;
   }
   public void setReleaseYear(int releaseYear) {
       this.releaseYear= releaseYear;
   }
   @Override
   public String toString() {
       return super.toString() + ", Year: " + releaseYear;
   }
        
}
