import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its absolute value: ");
        int num = sc.nextInt();

        // Using Math.abs() to find absolute value
        int absValue = Math.abs(num);
        System.out.println("Absolute value: " + absValue);

        sc.close();
    }
}
