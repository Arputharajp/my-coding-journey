# Add Without Main in Java

This program demonstrates how to perform operations in Java **without using the `main` method**. 

## Overview

In Java, the `main` method is the entry point of the program. However, using **static blocks**, it is possible to execute code **before the main method is called**, or even **without defining a main method**. 

`AddWithoutMain.java` demonstrates:

- Performing addition of numbers.
- Printing the result using a **static block**.

## Key Concepts

- **Static Block:** A block of code that runs when the class is loaded.
- **Execution Without `main`:** Using static blocks, Java allows running code even if the `main` method is not present.

### Example Usage

```java
class AddWithoutMain {
    static {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum);
        System.exit(0); // Stops the program after execution
    }
}
How to Run
Make sure Java is installed.

Compile the program:

bash
Copy code
javac AddWithoutMain.java
Run the program:

bash
Copy code
java AddWithoutMain
You will see the sum printed directly without defining a main method.

Learning Outcomes
Understand the use of static blocks in Java.

Learn how code can execute without a main method.

Explore alternative ways to initialize and execute Java programs.

Author
Arputharaj P
