package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    private GHappy str;
    @BeforeEach
    public void initialize() {
        this.str = new GHappy();
    }

    @ParameterizedTest
    @CsvSource( {"xxggxx", "ggxx", "xgg"})
    public void gHappy(String g) {
        boolean result = str.gHappy(g);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource( {"xxgxx", "xxggyygxx", "gxgx", "xgxg"})
    public void gUnHappy(String g) {
        boolean result = str.gHappy(g);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource( {"xxGGxx", "xxGxx", "xxGGyygxx"})
    public void gHappyLowerCase(String g) {
        boolean result = str.gHappy(g);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource( {"xxiixx", "xxixx", "xxyyxx"})
    public void gHappyNoExistG(String g) {
        boolean result = str.gHappy(g);
        Assertions.assertFalse(result);
    }
}
