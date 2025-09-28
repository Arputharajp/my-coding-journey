import java.util.Scanner;

public class CalculateGST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original price: ");
        double price = sc.nextDouble();
        System.out.print("Enter GST percentage: ");
        double gst = sc.nextDouble();

        // Calculate total price including GST
        double totalPrice = price + (price * gst / 100);
        System.out.println("Total price with GST: " + totalPrice);

        sc.close();
    }
}
