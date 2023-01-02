package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.mirror.Mirror;

public class GHappyTest {

  @ParameterizedTest(name = "{0}: ({1}, {2})")
  @CsvSource({
      // gHappy example (question 11)
      "'example-one','xxggxx',true", "'example-two','xxgxx',false", "'example-three','xxggyygxx',false",
      // Partition 1 - empty string
      "'empty string','',false",
      // Partition 2 - unhappy G at start, middle and end
      "'unhappy start','gaaa',false","'unhappy midle','aga',false","'unhappy end','abg',false",
      // Partition 3 - happy G at start, middle and end
      "'happy start','ggaaa',true","'happy midle','agga',true","'happy end','abgg',true",
  })
  public void testAlgorithm(String partition, String input, Boolean expectedResult) {
    Boolean result = new GHappy().gHappy(input);
    Assertions.assertEquals(expectedResult, result);
  }

}
