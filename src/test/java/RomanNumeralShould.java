import example.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralShould {
    @Test
    public void
    return_I_when_given_1(){
        var romanNumeral = new RomanNumeral();
        var result = romanNumeral.convert(1);
        assertEquals("I", result);
    }

    @Test
    public void
    return_II_when_given_2(){
        var romanNumeral = new RomanNumeral();
        var result = romanNumeral.convert(2);
        assertEquals("II", result);
    }

    @Test
    public void
    return_III_when_given_3(){
        var romanNumeral = new RomanNumeral();
        var result = romanNumeral.convert(3);
        assertEquals("III", result);
    }

}
