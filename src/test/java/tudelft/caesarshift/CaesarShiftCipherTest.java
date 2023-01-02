package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

  @ParameterizedTest(name = "{0}: ({1}, {2}) = {3}")
  @CsvSource({
      // Topics 1,2 - Practical exercise 2
      "'example-one','abc',3,'def'",
      // Partition 1 - empty string or null
      "'empty string','',0,'invalid'","'null',,0,'invalid'",
      // Partition 2 - invalid chars
      "'invalid-1','[abcdef',0,'invalid'","'invalid-2','abc&def',0,'invalid'",
      "'invalid-3','abcdef*',0,'invalid'",
      // Partition 3 - valid chars, no push
      "'no push','abcdef',0,'abcdef'",
      // Partition 4 - valid chars, positive numbers (including boundaries)
      "'valid-push1','abc def',1,'bcd efg'","'valid-push2','abcdef',2,'cdefgh'",
      "'valid-push3','abcdef',3,'defghi'","'valid-push4','abcdef',4,'efghij'",
      "'valid-push5',' abcdef',5,' fghijk'","'valid-push10','abcdef',10,'klmnop'",
      "'valid-push25','abcdef ',25,'zabcde '","'valid-push26','abcdef',26,'abcdef'",
      "'valid-push27','abcdef',27,'bcdefg'",
      // Partition 5 - valid chars, negative numbers (including boundaries)
      "'valid-push (-1)','abc def',-1,'zab cde'","'valid-push (-2)','abcdef',-2,'yzabcd'",
      "'valid-push (-3)','abcdef',-3,'xyzabc'","'valid-push (-4)','abcdef',-4,'wxyzab'",
      "'valid-push (-5)',' abcdef',-5,' vwxyza'","'valid-push (-10)','abcdef',-10,'qrstuv'",
      "'valid-push (-25)','abcdef ',-25,'bcdefg '","'valid-push (-26)','abcdef',-26,'abcdef'",
      "'valid-push (-27)','abcdef',-27,'zabcde'",
  })
  public void testAlgorithm(String partition, String input, int shift, String expectedResult) {
    String result = new CaesarShiftCipher().CaesarShiftCipher(input, shift);
    Assertions.assertEquals(expectedResult, result);
  }

}
