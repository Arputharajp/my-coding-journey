public class CopyArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[original.length];

        // Copy elements
        for(int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        // Print original array
        System.out.print("Original array: ");
        for(int num : original) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print copied array
        System.out.print("Copied array: ");
        for(int num : copy) {
            System.out.print(num + " ");
        }
    }
}
