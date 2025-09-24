public class LeftShift {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        int first = arr[0]; // store first element

        // Shift elements to the left
        for(int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = first; // place first element at last position

        System.out.print("Shifted array: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
