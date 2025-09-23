public class ArrayLengthAndValues {
    public static void main(String[] args) {
        // Declare and initialize the array
        int[] arr = {1, 2, 3, 4, 5};
        
        // Print the length of the array
        System.out.println("Length of array: " + arr.length);
        
        // Print all elements
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
