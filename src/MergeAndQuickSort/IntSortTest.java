package MergeAndQuickSort;

public class IntSortTest {

    /** Runs sort a number of times, and returns an array of the run times in seconds. In the first
      * run, N is firstN, and then it doubles each time. */
    public static double[] testSort(IntSorter sorter, int firstN, int runs, boolean ordered) {
        double[] seconds = new double[runs];
        
        int N = firstN;
        for (int i = 0; i < runs; i++) {
            int[] a = ordered ?
                ArrayUtil.createOrdered(N) :
                ArrayUtil.createShuffeled(N);

            long before = System.currentTimeMillis();
            sorter.sort(a);
            seconds[i] = (System.currentTimeMillis() - before) / 1000.0;

            ArrayUtil.testOrdered(a);
            N *= 2;             // double size for each test
        }
        return seconds;
    }
}
