# Find Remainder Without Using '%' Operator

This Java program calculates the **remainder** of two numbers without using the modulus (`%`) operator.

## How It Works

- The program reads a dividend and divisor from the user.
- It calculates the remainder using subtraction and division:
  ```java
  int remainder = dividend - (dividend / divisor) * divisor;
Prints the remainder to the console.

How to Run
Make sure you have Java installed.

Compile the program:

bash
Copy code
javac RemainderWithoutMod.java
Run the program:

bash
Copy code
java RemainderWithoutMod
Enter the dividend and divisor to see the remainder.

Example
yaml
Copy code
Enter the dividend: 17
Enter the divisor: 5
Remainder: 2
yaml
Copy code
Enter the dividend: 23
Enter the divisor: 4
Remainder: 3
