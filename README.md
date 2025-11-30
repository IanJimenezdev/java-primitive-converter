# Java Primitive Converter & Validator Library

A lightweight, robust Java utility library specifically designed to simplify user input via `JOptionPane`. It handles **String-to-Primitive conversion** and includes **automatic input validation loops**, ensuring your program never crashes due to invalid user input.

Ideally suited for university projects, Swing prototypes, or any Java application requiring quick and safe data entry.

## 🚀 Features

* **Type Safety:** Safely converts `String` input to `int`, `double`, `boolean`, `float`, `byte`, `short`, and `long`.
* **Auto-Validation:** The `read[Type]` methods automatically loop until the user provides valid data. No more `NumberFormatException` crashing your app!
* **Clean UX:** Provides clear error messages and re-prompts the user automatically within the GUI.
* **English Documentation:** Fully documented code.
* **Zero Dependencies:** Uses standard Java libraries (`javax.swing.JOptionPane`).

## 🛠️ Installation

Simply download the `ConverterStrings.java` file and place it in your project's source folder.

## 📖 Usage Examples

Since all methods are `static`, you don't need to instantiate the class. Just call the methods directly.

### 1. Reading Data (Input + Validation)
This is the most powerful feature. If the user enters text instead of a number, the library will show an error and ask again.

```java
// The library handles the try-catch logic for you
int age = ConverterStrings.readInt("Enter your age:");

double price = ConverterStrings.readDouble("Enter the product price:");

// Validates "true" or "false" (case insensitive)
boolean isMember = ConverterStrings.readBoolean("Are you a member?");

2. Conversion Only
If you already have a String and just need to parse it:
String value = "123";

if (ConverterStrings.isInt(value)) {
    int number = ConverterStrings.toInt(value);
    System.out.println("Converted number: " + number);
}

API Reference
Data Reading Methods (GUI)
Method                         Returns                           Description
readInt(String message)          int                             "Opens input dialog, validates integer, returns value."
readDouble(String message)     double                            "Opens input dialog, validates double, returns value."
readBoolean(String message)    boolean                           "Opens input dialog, validates boolean, returns value."
readString(String message)     String                             Basic input dialog. Exits program if canceled.
"(Includes support for float, long, byte, and short)",,

Contributing
This is an open-source project created for educational purposes. Feel free to fork it and add more features!

by IanJimenezdev
