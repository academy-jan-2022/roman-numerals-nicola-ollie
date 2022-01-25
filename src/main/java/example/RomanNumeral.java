package example;

import java.util.Dictionary;
import java.util.Hashtable;

public class RomanNumeral {
    Hashtable<Integer, String> ArabicToRoman = new Hashtable();


    public String convert(int arabic) {

        ArabicToRoman.put(1000, "M");
        ArabicToRoman.put(500, "D");
        ArabicToRoman.put(100, "C");
        ArabicToRoman.put(50, "L");
        ArabicToRoman.put(10, "X");
        ArabicToRoman.put(5, "V");
        ArabicToRoman.put(1, "I");

        var numeralString = "";

        while (arabic >= 100){
            numeralString += ArabicToRoman.get(100);
            arabic = arabic - 100;
        }

        while (arabic >= 50){
            numeralString += ArabicToRoman.get(50);
            arabic = arabic - 50;
        }
        while (arabic >= 10){
            numeralString += ArabicToRoman.get(10);
            arabic = arabic - 10;
        }

        while (arabic >= 5){
            numeralString += ArabicToRoman.get(5);
            arabic -= 5;
        }

        while (arabic >= 1){
            numeralString += ArabicToRoman.get(1);
            arabic -= 1;
        }

        return numeralString;
    }


}
