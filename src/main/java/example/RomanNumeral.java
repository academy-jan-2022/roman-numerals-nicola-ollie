package example;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeral {
    LinkedHashMap<Integer, String> ArabicToRoman = new LinkedHashMap<>();


    public String convert(int arabic) {

        ArabicToRoman.put(1000, "M");
        ArabicToRoman.put(500, "D");
        ArabicToRoman.put(100, "C");
        ArabicToRoman.put(50, "L");
        ArabicToRoman.put(10, "X");
        ArabicToRoman.put(9, "IX");
        ArabicToRoman.put(5, "V");
        ArabicToRoman.put(4, "IV");
        ArabicToRoman.put(1, "I");

        var numeralString = "";


        for (Map.Entry<Integer, String> entry : ArabicToRoman.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            while (arabic >= key) {
                numeralString += value;
                arabic = arabic - key;
            }
        }

        return numeralString;
    }
}
