public class PrintAlternateElements {
    public static void main(String[] args) {
        // Declare and initialize the array
        int[] arr = {1, 2, 3, 4, 5};
        
        // Print alternate elements
        System.out.print("Alternate elements: ");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
