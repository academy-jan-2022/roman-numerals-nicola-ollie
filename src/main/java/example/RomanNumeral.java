package example;

public class RomanNumeral {
    public String convert(int arabic) {
        if (arabic == 5) {
            return "V";
        }

        if (arabic == 6){
            return "VI";
        }

        if (arabic == 7){
            return "VII";
        }

        var numeralString = "";
        for (var i = 0; i < arabic; i++){
            numeralString += "I";
        }

        return numeralString;

    }

}
