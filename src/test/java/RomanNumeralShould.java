import example.RomanNumeral;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralShould {
    @ParameterizedTest
    @MethodSource("numeralTestCase") public void
    return_roman_numeral_when_given_arabic_number(String roman, int arabic) {
        var romanNumeral = new RomanNumeral();
        var result = romanNumeral.convert(arabic);
        assertEquals(roman, result);

    }

    private static Stream<Arguments> numeralTestCase() {
        return Stream.of(
                Arguments.of("I", 1),
                Arguments.of("II", 2),
                Arguments.of("III", 3),
                Arguments.of("V", 5),
                Arguments.of("VI", 6),
                Arguments.of("VII", 7),
                Arguments.of("VIII", 8),
                Arguments.of("X", 10),
                Arguments.of("XX", 20),
                Arguments.of("XXVI", 26),
                Arguments.of("L", 50),
                Arguments.of("C", 100),
                Arguments.of("MM", 2000),
                Arguments.of("IV", 4),
                Arguments.of("IX", 9),
                Arguments.of("XL", 40),
                Arguments.of("XC", 90)
        );
    }

}
