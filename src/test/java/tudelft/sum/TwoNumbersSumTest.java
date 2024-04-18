package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {
    @Test
    public void sumPosNumber(){
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1,1,9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1,0));

        TwoNumbersSum addTwoNumbers = new TwoNumbersSum();
        ArrayList<Integer> result = addTwoNumbers.addTwoNumbers(first, second);

        Assertions.assertEquals(9, result.get(2));
    }

    @Test
    public void sumNegNumber(){
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(-1,1));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1,0));

        TwoNumbersSum addTwoNumbers = new TwoNumbersSum();
        ArrayList<Integer> result = addTwoNumbers.addTwoNumbers(first, second);

        Assertions.assertEquals(0, result.size());

    }

}
