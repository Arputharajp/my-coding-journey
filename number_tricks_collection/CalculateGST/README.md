# GST Calculator

This Java program calculates the **total price including GST** for a given original price and GST percentage.

## How It Works

- The program reads the original price and GST percentage from the user.
- Calculates the total price using the formula:
  ```java
  double totalPrice = price + (price * gst / 100);
Prints the total price including GST.

How to Run
Make sure you have Java installed.

Compile the program:

bash
Copy code
javac CalculateGST.java
Run the program:

bash
Copy code
java CalculateGST
Enter the original price and GST percentage to get the total price.

Example
yaml
Copy code
Enter the original price: 1000
Enter GST percentage: 18
Total price with GST: 1180.0
yaml
Copy code
Enter the original price: 500
Enter GST percentage: 12
Total price with GST: 560.0
