

public abstract class music
{
  private String title;
  private int length;
  
  public music(String title, int length) {
      this.title =  title;
      this.length = length;
  }
  public String getTitle() {
      return title;
  }
  public int getLength() {
      return length;
  }
  public void setTitle(String title){
      this.title =  title;
  }
  public void setLength(int length) {
      this.length = length;
  }
  @Override
  public String toString() {
      return "Title: " + title + ", Length: " + length;
  }
}
