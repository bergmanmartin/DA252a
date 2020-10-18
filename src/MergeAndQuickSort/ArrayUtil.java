package MergeAndQuickSort;

import java.util.Random;

public class ArrayUtil {
    public static void shuffle(int[] a) {
        int N = a.length;
        Random randomGenerator = new Random();
        for (int i = 0; i < N; i++) {
            int r = i + randomGenerator.nextInt(N-i);     // between i and N-1
            int t = a[i]; a[i] = a[r]; a[r] = t;
        }
    }

    public static int[] createOrdered(int N) {
        int[] a = new int[N];
        Random randomGenerator = new Random();
        for (int i = 0, x = 0; i < N; i++) {
            x += randomGenerator.nextInt(5);
            a[i] = x;
        }
        return a;
    }

    public static int[] createShuffeled(int N) {
        int[] a = createOrdered(N);
        shuffle(a);
        return a;
    }

    public static class SortingException extends RuntimeException {
        public SortingException(String message) { super(message); }
    }

    /** Throws ArrayUtil.SortingException if a is not sorted. */
    public static void testOrdered(int[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            if (a[i] < a[i-1]) {
                throw new SortingException("Not sorted, a["+(i-1)+"] > a["+i+"]");
            }
        }
    }

    public static void main(String[] args) {
        MergeSort m = new MergeSort();
<<<<<<< HEAD
        int [] a = createShuffeled(10000);
        //m.sort(a);
        InsertionSorter is = new InsertionSorter();
        is.sort(a);
        System.out.println(Arrays.toString(a));

=======
        int [] a = createShuffeled(1000);
        m.sort(a);
        System.out.println(a);
>>>>>>> 5f9017e9f7b209323fe05f2987e0d8b62d09b7bb
    }
}
