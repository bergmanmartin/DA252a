package MergeAndQuickSort;

public class MergeSortVariant implements IntSorter {


    @Override
    public void sort(int[] a) {
        int N = a.length;
        int[] aux = new int[a.length];
        sort(a, 0, N-1, aux);
    }

    private static void sort(int[] a, int lo, int hi, int[] aux){
         if ((hi - lo+1 <= 100000) ) {
            InsertionSorter sorter = new InsertionSorter();
            sorter.sort(a, lo, hi);
            return;

         } else {
             int mid = lo + (hi - lo) / 2;

             sort(a, lo, mid, aux); // Sorterar vänstra halvan mid är då högsta
             sort(a, mid + 1, hi, aux); // Sorterar högra halvan mid+1 är lägsta
             merge(a, lo, mid, hi, aux);
         }
    }

    /**
     * K är index för hela arrayen medan i och j är indexen i de två uppdelade arrayerna
     * @param a
     * @param lo
     * @param mid
     * @param hi
     * @param aux
     */
    private static void merge(int[] a, int lo, int mid, int hi, int[] aux) {

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (aux[i] <= aux[j]) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }
    }

}
