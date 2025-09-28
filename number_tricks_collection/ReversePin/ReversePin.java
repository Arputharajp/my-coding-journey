import java.util.Scanner;

public class ReversePin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a PIN to reverse: ");
        int pin = sc.nextInt();

        // Reverse the PIN without using a loop
        String reversedPin = new StringBuilder(String.valueOf(pin)).reverse().toString();
        System.out.println("Reversed PIN: " + reversedPin);

        sc.close();
    }
}
