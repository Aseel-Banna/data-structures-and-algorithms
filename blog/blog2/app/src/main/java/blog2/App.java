/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package blog2;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n > 1) {
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
        }
    }

    public static void merge(int[] a, int[] left, int[] right) {

        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            }
            else {
                a[k++] = right[j++];
            }
        }
        while (i < left.length) {
            a[k++] = left[i++];
        }
        while (j < right.length) {
            a[k++] = right[j++];
        }
    }
}
