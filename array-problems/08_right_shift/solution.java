public class RightShift {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        
        int last = arr[n - 1]; // store last element

        // Shift elements to the right
        for(int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last; // place last element at first position

        System.out.print("Shifted array: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
