import javax.swing.JOptionPane;

public class TestLibrary {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Starting ConverterStrings tests.\nWe will verify data validation.");

        // 1. INT TEST
        System.out.println("--- Testing readInt ---");
        // Try entering letters first to see the error, then a number.
        int age = ConverterStrings.readInt("Test 1: Enter your age (int):");
        System.out.println("Success. Age captured: " + age);

        // 2. DOUBLE TEST
        System.out.println("--- Testing readDouble ---");
        // Try entering a text or boolean.
        double price = ConverterStrings.readDouble("Test 2: Enter a price (double):");
        System.out.println("Success. Price captured: " + price);

        // 3. BOOLEAN TEST
        System.out.println("--- Testing readBoolean ---");
        // Try entering "yes", "no". It should only accept "true" or "false".
        boolean isStudent = ConverterStrings.readBoolean("Test 3: Are you a student? (true/false):");
        System.out.println("Success. Boolean captured: " + isStudent);

        // 4. CANCEL TEST
        JOptionPane.showMessageDialog(null, "Final Test: In the next window, press CANCEL.");
        String cancelTest = ConverterStrings.readString("Press Cancel or the X button");

        // If the program reaches this line, System.exit(0) failed.
        System.out.println("ERROR: The program should have closed.");
    }
}