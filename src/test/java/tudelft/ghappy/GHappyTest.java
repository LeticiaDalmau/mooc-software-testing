package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @ParameterizedTest
    @CsvSource( {"xxggxx", "xxgxx", "xxggyygxx", "ggxx", "xgg", "gxgx", "xgxg"})
    public void gHappy(String g) {
        GHappy str = new GHappy();
        boolean result = str.gHappy(g);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource( {"xxGGxx", "xxGxx", "xxGGyygxx"})
    public void gHappyUpperCase(String g) {
        GHappy str = new GHappy();
        boolean result = str.gHappy(g);
        Assertions.assertFalse(result);
    }
}
