/*
 * HangManWordPicker.java
 *
 * Created on Apr 21, 2012, 3:29:01 PM
 * @authors Ben McFerren & Brice Proctor
 * @description Hangman Game with GUI and Three Levels
 */

package hangman;

import java.util.ArrayList;
import java.util.Random;

public class HangManWordPicker {
    
    ArrayList<String> words;
    
    //receives a variable amount of possibilities to use as the secret word
    public HangManWordPicker(String ... bigWords)
    {
        words = new ArrayList<String>();
        for (int i = 0; i < bigWords.length; i++)        
        { 
            try
            {
                words.add(bigWords [i]);
            }
            catch( Exception e)
            {
                System.out.print("Error: You went out of bounds with the ArrayList");
            }        
                    
        }
    }
    
    //selects a word from the argument array
    public String chooseIt()
    {
        Random randomNumbers = new Random();
        int pick = randomNumbers.nextInt(words.size());
        return words.get(pick);
    }
}
