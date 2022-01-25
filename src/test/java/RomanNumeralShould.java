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

    @Test
    public void
    return_V_when_given_5(){
        var romanNumeral = new RomanNumeral();
        var result = romanNumeral.convert(5);
        assertEquals("V", result);
    }

    @Test
    public void
    return_VI_when_given_6(){
        var romanNumeral = new RomanNumeral();
        var result = romanNumeral.convert(6);
        assertEquals("VI", result);
    }

}
