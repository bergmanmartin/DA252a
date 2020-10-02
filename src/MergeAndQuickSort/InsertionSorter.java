package MergeAndQuickSort;

public class InsertionSorter implements IntSorter {

    public void sort(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0 && a[j] < a[j-1]; j--) {
                int x = a[j]; a[j] = a[j-1]; a[j-1] = x;
            }
        }
    }


    public void sort(int[] arr, int low, int high) {

        for (int i = low + 1; i <= high; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >=  low && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }
}
