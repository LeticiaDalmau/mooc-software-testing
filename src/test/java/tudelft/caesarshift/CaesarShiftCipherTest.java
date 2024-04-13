package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    private CaesarShiftCipher Cipher ;
    @BeforeEach
    public void initialize() {
        this.Cipher  = new CaesarShiftCipher();
    }

    @ParameterizedTest
    @CsvSource( {"'def',3,'ghi'", "'abc',3,'def'"})
    public void letter(String message, int shift, String expectedResult) {
        String result = Cipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource( {"' def ',3,' ghi '", "'ab c',3,'de f'"})
    public void letterWithSpaces(String message, int shift, String expectedResult) {
        String result = Cipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource( {"'Lc',3,'invalid'", "'a Pc',3,'invalid'"})
    public void NoUppercaseLetter(String message, int shift, String expectedResult) {
        String result = Cipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource( {"'222',3,'invalid'", "'a1c',3,'invalid'"})
    public void NoNumbers(String message, int shift, String expectedResult) {
        String result = Cipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource( {"'abc',-1,'zab'", "'abc',-2,'yza'"})
    public void letterNegativeShift(String message, int shift, String expectedResult) {
        String result = Cipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }

}
