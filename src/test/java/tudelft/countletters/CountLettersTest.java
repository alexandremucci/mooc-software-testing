package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|car|dog");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastCharIsInvalid() {
        int words = new CountLetters().count("cats|car|dog|");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordMatches() {
        int words = new CountLetters().count("cats|car");
        Assertions.assertEquals(2, words);
    }
}