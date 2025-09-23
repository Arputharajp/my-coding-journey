public class MergeArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {6, 7, 8, 9, 10};
        int c[] = new int[a.length + b.length];

        int i = 0;
        // Copy elements from first array
        for(int num : a) {
            c[i++] = num;
        }
        // Copy elements from second array
        for(int num : b) {
            c[i++] = num;
        }

        // Print merged array
        System.out.print("Merged array: ");
        for(int num : c) {
            System.out.print(num + " ");
        }
    }
}
