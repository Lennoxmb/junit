import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

    Bird bird1 = new Bird("cardinal");
    Bird bird2 = new Bird("finch");
    Bird bird3 = new Bird("finch");

    @Test
    public void testAddition(){
        int input1 = 6;
        int input2 = 8;
        int expectedResult = 14;

        assertEquals(expectedResult, Calculator.add(input1, input2));
    }

    @Test
    public void testTipCalculator(){
        double cost = 22.56;
        double tipPercentage = 15;
        double tip = 3.38;

        assertEquals(tip, Calculator.tipCalculator(cost, tipPercentage), 0.01);
    }

    @Test
    public void testObjectSameness(){
        assertNotSame(bird2, bird3);
    }

    //reate a test method which uses assertEquals or assertNotEquals to verify if the String Codeup is the same as CodeUp.
    @Test
    public void testString(){
        String input = "Codeup";
        String input2 = "CodeUp";

        assertNotEquals(input, input2);
    }

    @Test
    public void testArrayList(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        assertNotSame(languages, moreLanguages);
    }


    @Test
    public void testArray(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testString2(){
        String language = "PHP";
        assertTrue(true);
        assertFalse(false);
    }

    @Test
    public void testString3(){
        String language = null;
        assertNull(language);

        language = "Java";
        assertNotNull(language);
    }

}