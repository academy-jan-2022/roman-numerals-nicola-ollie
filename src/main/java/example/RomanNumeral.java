package example;

public class RomanNumeral {
    public String convert(int arabic) {
        var numeralString = "";

        if (arabic >= 5){
            numeralString += "V";
            arabic -= 5;
        }

        for (var i = 0; i < arabic; i++){
            numeralString += "I";
        }

        return numeralString;

    }

}
