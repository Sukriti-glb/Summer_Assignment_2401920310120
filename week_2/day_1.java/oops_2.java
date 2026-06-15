// File: music/Playable.java
package music;

public interface Playable {
    void play();
}
// File: music/string/Veena.java
package music.string;

import music.Playable;

public class Veena implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the Veena: Producing beautiful string melodies.");
    }
}
// File: music/wind/Saxophone.java
package music.wind;

import music.Playable;

public class Saxophone implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the Saxophone: Producing rich wind/jazz notes.");
    }
}
// File: live/Test.java
package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        
        // a. Create an instance of Veena and call play() method
        Veena veena = new Veena();
        veena.play();
        
        // b. Create an instance of Saxophone and call play() method
        Saxophone saxophone = new Saxophone();
        saxophone.play();
        
        System.out.println("\n--- Demonstrating Polymorphism ---");
        Playable playableVariable;
        
        // Holding the Veena instance
        playableVariable = veena; 
        playableVariable.play();
        
        // Holding the Saxophone instance
        playableVariable = saxophone; 
        playableVariable.play();
    }
}