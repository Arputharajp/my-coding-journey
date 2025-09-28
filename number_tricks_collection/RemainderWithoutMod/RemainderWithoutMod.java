import java.util.Scanner;

public class RemainderWithoutMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Calculate remainder without using % operator
        int remainder = dividend - (dividend / divisor) * divisor;
        System.out.println("Remainder: " + remainder);

        sc.close();
    }
}
