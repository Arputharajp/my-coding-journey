import java.util.Scanner;

public class OddEvenTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Using ternary operator to check odd or even
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is: " + result);

        sc.close();
    }
}
