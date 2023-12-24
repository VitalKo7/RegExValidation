package validator.utils;/*
    a) Credit card number(8-16 digits)
    b) Date (Format: DD.MM.YYYY)
    c) Date (Format: YYYY-MM-DD)
    d) Phone Number(Format: +99(99)9999-9999)
    e) Number less and equals 255 (positive)
*/

public class Validator {
    public static boolean checkCreditCardNumber(String str) {
//        return str.matches("[0-9]{8,16}");
        return str.matches("\\d{8,16}");
    }

    public static boolean checkDateFormatEU(String str) {
        return str.matches("(0[1-9]|1[0-9]|2[0-9]|3[0-1])[.](0[1-9]|1[0-2])[.]\\d{1,4}");
    }

    public static boolean checkDateFormatUS(String str) {
        return str.matches("\\d{1,4}-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[0-1])");
    }

    public static boolean checkPhoneNumber(String str) {
        return str.matches("\\+9{2}\\(01\\)[0-9]{4}-[0-9]{4}");
    }

    public static boolean checkLessEquals255(String str) {
        return str.matches("[0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]");
    }
}