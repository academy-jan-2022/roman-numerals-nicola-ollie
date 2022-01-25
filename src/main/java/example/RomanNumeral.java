package example;

public class RomanNumeral {
    public String convert(int arabic) {
        if (arabic == 5) {
            return "V";
        }

        var numeralString = "";
        for (var i = 0; i < arabic; i++){
            numeralString += "I";
        }

        return numeralString;

    }

}
