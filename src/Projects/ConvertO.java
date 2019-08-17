package Projects;

import java.time.Year;
import java.util.Calendar;

public class ConvertO {
    public static void main(String[] args) {
//        int num = 11;
////        String text = (num < 10 ? "0" : "") + num;
//        String text = String.format("%02d", num);
//        System.out.println(text);
//        String someString = "vi";
//        System.out.println(isNumeric(someString));
//        int year = Calendar.getInstance().get(Calendar.YEAR);
        int year = Year.now().getValue();
        String yearStr = String.valueOf(year);
        String substr = yearStr.substring(yearStr.length() - 2);
        System.out.println(substr);
//        boolean isNumeric = someString.chars().allMatch(Character::isDigit);
//        System.out.println(isNumeric);
    }

    private static boolean isNumeric(String str) {
//        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
        return str.chars().allMatch(Character::isDigit);
    }
}
