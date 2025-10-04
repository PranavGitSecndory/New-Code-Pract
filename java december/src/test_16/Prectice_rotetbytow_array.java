package test_16;

public class Prectice_rotetbytow_array {
    public static void main(String arg[]) {
        int a[] = {1, 2, 3, 4, 5};
        int k = 3;
        int n = a.length;
        int b[] = new int[n];

        // Step 1: Copy last k elements to the front of b
        for (int i = 0; i < k; i++) {
            b[i] = a[n - k + i];
        }

        // Step 2: Copy first n-k elements to the rest of b
        for (int i = k; i < n; i++) {
            b[i] = a[i - k];
        }

        // Print rotated array
        System.out.println("After rotating by " + k + " positions clockwise:");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
