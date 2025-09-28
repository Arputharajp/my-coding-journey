# Reverse a PIN Without Using Loops

This Java program reverses a given PIN or number **without using loops**.

## How It Works

- The program reads a number (PIN) from the user.
- It converts the number to a string using `String.valueOf(pin)`.
- Uses `StringBuilder` and its `reverse()` method to reverse the digits.
- Converts it back to string or integer and prints the result.

```java
String reversedPin = new StringBuilder(String.valueOf(pin)).reverse().toString();
How to Run
Make sure you have Java installed.

Compile the program:

bash
Copy code
javac ReversePin.java
Run the program:

bash
Copy code
java ReversePin
Enter a PIN to see the reversed output.

Example
yaml
Copy code
Enter a PIN to reverse: 1234
Reversed PIN: 4321
css
Copy code
Enter a PIN to reverse: 98765
Reversed PIN: 56789
