package example;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeral {
    LinkedHashMap<Integer, String> ArabicToRoman = new LinkedHashMap<>(){
        {
            put(1000, "M");
            put(500, "D");
            put(100, "C");
            put(90, "XC");
            put(50, "L");
            put(40, "XL");
            put(10, "X");
            put(9, "IX");
            put(5, "V");
            put(4, "IV");
            put(1, "I");
        }
    };


    public String convert(int arabic) {

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
