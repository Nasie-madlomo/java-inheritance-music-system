import java.util.Arrays;
import java.util.Random;
public class musicTest
{
public static void main(String[]args) {
 music[] musicArray = createRandomMusicArray(10);   
  System.out.println("=== BEFORE SORTING ===");
        for(music m : musicArray) {
            System.out.println("Implicit: " + m);
            System.out.println("Explicit: " + m.toString());
            System.out.println();
  
    }
     long startTime = System.nanoTime();
      Arrays.sort(musicArray);
      long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        
        System.out.println("\n=== AFTER SORTING (by title) ===");
        for(music m : musicArray) {
            System.out.println("Implicit: " + m);
            System.out.println("Explicit: " + m.toString());
            System.out.println();
}
analyzeTimeComplexity(musicArray.length, executionTime);
}

public static music[] createRandomMusicArray(int size) {
        Random random = new Random();
        music[] array = new music[size];
        String[] songTitles = {"Bohemian Rhapsody", "Imagine", "Yesterday", 
                              "Sweet Child O'Mine", "Billie Jean", "Smells Like Teen Spirit"};
        String[] genreNames = {"Rock", "Pop", "Jazz", "Classical", "Hip Hop", "Electronic"};
         for (int i = 0; i < size; i++) {
            if (random.nextBoolean()) {
           String randomTitle = songTitles[random.nextInt(songTitles.length)];
                int randomLength = random.nextInt(400) + 120;
                int randomYear = random.nextInt(55) + 1970;
                array[i] = new song(randomTitle, randomLength, randomYear);
            } else {
              String randomGenre = genreNames[random.nextInt(genreNames.length)];
                int randomLength = random.nextInt(500) + 100;
                boolean randomPopular = random.nextBoolean();
                array[i] = new genre(randomGenre, randomLength, randomPopular);
            }
        }
        return array;
    }   
    public static void analyzeTimeComplexity(int n, long executionTime) {
        System.out.println("\n=== TIME COMPLEXITY ANALYSIS ===");
        System.out.println("Input size (n): " + n);
        System.out.println("Execution time: " + executionTime + " nanoseconds");
        
        System.out.println("\n1. DETAILED METHOD (τ-notation):");
        System.out.println("   T(n) = C + n*log(n)*K");
        System.out.println("   Where C, K are machine-dependent constants");
        
        System.out.println("\n2. SIMPLIFIED METHOD:");
        System.out.println("   T(n) = O(n) + O(n*log(n))");
        System.out.println("   Dominant term: O(n*log(n))");
        
        System.out.println("\n3. ASYMPTOTIC ANALYSIS (Big O Notation):");
        System.out.println("   O(n*log(n)) - Linearithmic time complexity");
         System.out.println("   Reason: Arrays.sort() uses optimized TimSort algorithm");
    }
}
