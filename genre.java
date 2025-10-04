

public class genre extends music
{
    private boolean popular;
    
    public genre(String title, int length, boolean popular) {
        super(title, length);
        this.popular = popular;
    }
    public boolean getPopular() {
        return popular;
    }
    public void setPopular(boolean popular) {
        this.popular = popular; 
    }
    @Override
    public String toString() {
        return super.toString() + ", popular: " + (popular ? "Yes" : "No");
    }
}
