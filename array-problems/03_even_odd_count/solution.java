public class EvenOddCount {
    public static void main(String[] args) {
        // Declare and initialize the array
        int[] arr = {1, 2, 3, 4, 5};
        
        int evenCount = 0;
        int oddCount = 0;
        
        // Count even and odd numbers
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        // Print results
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
