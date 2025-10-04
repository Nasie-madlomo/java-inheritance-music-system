

public class musicTest
{
public static void main(String[]args) {
    music[] music = new music[2];
    
    music[0] = new song("Forever", 4, 2007);
    music[1] = new genre("R&B", 1940, true);
    
   for(music m : music) {
       System.out.println("Implicit toString: " + m);
       
       System.out.println("Explicit toString: " + m.toString());
       System.out.println();
       
   }
}
}
