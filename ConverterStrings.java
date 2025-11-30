//Custom module library.
import static javax.swing.JOptionPane.*;
public class ConverterStrings {
    //The library does not have a main function (because it will not be executed).

    // =============================
    //1) Conversion modules section.
    // =============================

    //String to boolean
    public static boolean toBoolean (String value){
        return Boolean.parseBoolean(value);
    }

    //String to byte
    public static byte toByte (String value){
        return Byte.parseByte(value);
    }

    //String to short
    public static short toShort (String value){
        return Short.parseShort(value);
    }

    //String to int
    public static int toInt (String value){
        return Integer.parseInt(value);
    }

    //String to long
    public static long toLong (String value){
        return Long.parseLong(value);
    }

    //String to float
    public static float toFloat (String value){
        return Float.parseFloat(value);
    }

    //String to double
    public static double toDouble (String value){
        return Double.parseDouble(value);
    }

    // ===============================
    //2) Verification modules section.
    // ===============================

    //Check if a String is an int
    public static boolean isInt (String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Check if a String is a boolean
    public static boolean isBoolean(String value) {
    if(value == null) return false;
    String normalized = value.toLowerCase();
    return normalized.equals("true") || normalized.equals("false");
    }

    //Check if a String is a byte
    public static boolean isByte(String value) {
        try {
            Byte.parseByte(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Check if a String is a short
    public static boolean isShort(String value) {
        try {
            Short.parseShort(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Check if a String a long
    public static boolean isLong(String value) {
        try {
            Long.parseLong(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Check if a String a double
    public static boolean isDouble(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Check if a String a float
    public static boolean isFloat(String value) {
        try {
            Float.parseFloat(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // ==============================
    //3) Data reading module section.
    // ==============================

    //String reading module.
    public static String readString (String message){
        String UserInput = showInputDialog(message);

        if(UserInput == null){
            System.out.println("Program cancelled by user.");
            System.exit(0);
        }
        return UserInput;
    }

    //Read int (Validates automatically).
    public static int readInt (String message) {
        String input = readString(message);
        while (!isInt(input)) {
            input = readString("ERROR: You must enter an integer (int).\n" + message);
        }
        return toInt(input);
    }

    //Read double (Validates automatically).
    public static double readDouble (String message) {
        String input = readString(message);
        while (!isDouble(input)) {
            input = readString("ERROR: You must enter a decimal number (double).\n" + message);
        }
        return toDouble(input);
    }

    //Read byte (Validates automatically).
    public static byte readByte (String message) {
        String input = readString(message);
        while (!isByte(input)) {
            input = readString("ERROR: You must enter a byte value.\n" + message);
        }
        return toByte(input);
    }

    //Read boolean (Validates automatically).
    public static boolean readBoolean (String message) {
        String input = readString(message);
        while (!isBoolean(input)) {
            input = readString("ERROR: You must enter a 'true' or 'false'.\n" + message);
        }
        return toBoolean(input);
    }

    //Read short (Validates automatically).
    public static short readShort (String message) {
        String input = readString(message);
        while (!isShort(input)) {
            input = readString("ERROR: You must enter a short value.\n" + message);
        }
        return toShort(input);
    }

    //Read long (Validates automatically).
    public static long readLong (String message) {
        String input = readString(message);
        while (!isLong(input)) {
            input = readString("ERROR: You must enter a long value.\n" + message);
        }
        return toLong(input);
    }

    //Read float (Validates automatically).
    public static float readFloat (String message) {
        String input = readString(message);
        while (!isFloat(input)) {
            input = readString("ERROR: You must enter a float value.\n" + message);
        }
        return toFloat(input);
    }
}