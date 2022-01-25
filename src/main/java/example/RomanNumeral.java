package example;

public class RomanNumeral {
    public String convert(int arabic) {
        var numeralString = "";


        if (arabic >= 10){
            numeralString += "X";
            arabic = arabic % 10;
        }
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
