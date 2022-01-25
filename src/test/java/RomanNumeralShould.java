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

    @Test
    public void
    return_VII_when_given_7(){
        var romanNumeral = new RomanNumeral();
        var result = romanNumeral.convert(7);
        assertEquals("VII", result);
    }

    @Test
    public void
    return_VIII_when_given_8(){
        var romanNumeral = new RomanNumeral();
        var result = romanNumeral.convert(8);
        assertEquals("VIII", result);
    }

    @Test
    public void
    return_X_when_given_10(){
        var romanNumeral = new RomanNumeral();
        var result = romanNumeral.convert(10);
        assertEquals("X", result);
    }

    @Test
    public void
    return_XX_when_given_20(){
        var romanNumeral = new RomanNumeral();
        var result = romanNumeral.convert(20);
        assertEquals("XX", result);
    }

}
