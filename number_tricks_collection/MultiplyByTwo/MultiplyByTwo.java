import java.util.Scanner;

public class MultiplyByTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to multiply by 2: ");
        int num = sc.nextInt();

        // Multiply by 2 using left shift operator
        int result = num << 1;
        System.out.println("Result: " + result);

        sc.close();
    }
}
