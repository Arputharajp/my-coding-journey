# Check Divisibility by 2 Without Using '/' Operator

This Java program checks whether a number is divisible by **2** without using the division (`/`) operator.

## How It Works

- The program reads a number from the user.
- It uses the **bitwise AND operator (`&`)**:
  ```java
  boolean isDivisible = (num & 1) == 0;
If the least significant bit is 0, the number is divisible by 2.

Prints true if divisible, false otherwise.

How to Run
Make sure you have Java installed.

Compile the program:

bash
Copy code
javac DivisibleByTwo.java
Run the program:

bash
Copy code
java DivisibleByTwo
Enter a number and check the result.

Example
pgsql
Copy code
Enter a number to check if divisible by 2: 8
Divisible by 2? true
pgsql
Copy code
Enter a number to check if divisible by 2: 7
Divisible by 2? false
