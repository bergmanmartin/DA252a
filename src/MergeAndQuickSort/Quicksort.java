package MergeAndQuickSort;

import java.lang.reflect.Array;

public class Quicksort implements IntSorter {

    @Override
    public void sort(int[] a) {
        int N = a.length;
        ArrayUtil.shuffle(a);
        sort(a, 0, N-1);

    }
    public static void sort(int[] aux, int lo, int hi) {

         if (hi <= lo) {
            return;
        }
        int j = partition(aux, lo, hi);
        sort(aux, lo, j-1);
        sort(aux, j+1, hi);
    }

    /**
     * Omarrangerar arrayen så att några villkor upphålls.
     * @param a
     * @param lo
     * @param hi
     * @return
     */
    private static int partition(int[] a, int lo, int hi) {
        boolean running = true;
        int i = lo; int j = hi+1;
        int v = a[lo];

        while (running) {
            while (less(a[++i], v)) {

                if (i == hi) {
                    break;
                }
            }
            while (less(v, a[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exch(a, i, j);

        }
        exch(a, lo, j);
        return j;

    }

    private static void exch(int[] a, int i , int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    private static boolean less(Comparable v , Comparable w) {
        return v.compareTo(w) < 0;
    }


}
