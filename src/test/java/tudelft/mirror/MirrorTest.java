package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest {

  @ParameterizedTest(name = "{0}: ({1}, {2})")
  @CsvSource({
      // mirrorEnds example (question 10)
      "'example-two','abXYZba','ab'", "'example-one','abca','a'", "'example-three','aba','ab'",
      // Partition 1 - empty string
      "'empty string','',''",
      // Partition 2 - even and odd input lengths (mirror does exist - no mixed case)
      "'1','a','a'","'2','aa','a'","'3','aba','ab'","'4','abba','ab'","'5','abcba','abc'","'6','abccba','abc'","'7','abcdcba','abcd'",
      // Partition 3 - even and odd input lengths (mirror does not exist starting 2 - no mixed case)
      "'1','a','a'","'2','ab',''","'3','abc',''","'4','abcd',''","'5','abxbd',''"
  })
  public void testAlgorithm(String partition, String input, String expectedResult) {
    String result = new Mirror().mirrorEnds(input);
    Assertions.assertEquals(expectedResult, result);
  }

}
