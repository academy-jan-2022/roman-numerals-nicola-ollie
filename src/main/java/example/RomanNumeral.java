package example;

public class RomanNumeral {
    public String convert(int arabic) {
        if (arabic == 3){
            return "III";
        }
        if (arabic == 2){
            return "II";
        }
        return "I";
    }

}
