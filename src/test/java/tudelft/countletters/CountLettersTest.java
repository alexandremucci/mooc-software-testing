package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void LatCharS() {
        int test = new CountLetters().count("car|dog|cats");
        Assertions.assertEquals(2, test);
    }

    @Test
    public void LastCharR() {
        int words = new CountLetters().count("cats|dog|car");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void LastCharNotRorS() {
        int words = new CountLetters().count("cats|car|dog");
        Assertions.assertEquals(2, words);
    }

}