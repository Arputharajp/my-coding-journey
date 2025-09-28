import java.util.Scanner;

public class DivisibleByTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if divisible by 2: ");
        int num = sc.nextInt();

        // Check divisibility by 2 using bitwise AND
        boolean isDivisible = (num & 1) == 0;
        System.out.println("Divisible by 2? " + isDivisible);

        sc.close();
    }
}
