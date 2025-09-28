# Multiply by 2 Without Using '*' Operator

This Java program multiplies a given number by **2** without using the multiplication (`*`) operator.  

## How It Works

- The program reads a number from the user.
- It uses the **left shift operator (`<<`)** to multiply by 2:
  ```java
  int result = num << 1;
Left shifting a number by 1 bit is equivalent to multiplying it by 2.

The result is printed to the console.

How to Run
Make sure you have Java installed.

Compile the program:

bash
Copy code
javac MultiplyByTwo.java
Run the program:

bash
Copy code
java MultiplyByTwo
Enter a number to see the result.

Example
vbnet
Copy code
Enter a number to multiply by 2: 7
Result: 14
vbnet
Copy code
Enter a number to multiply by 2: 15
Result: 30
