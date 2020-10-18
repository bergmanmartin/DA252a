package MergeAndQuickSort;

public class TestInsertionSort {
    private static void report(double[] seconds, int firstN) {
        for (int i = 0, N = firstN; i < seconds.length; i++) {
            System.out.println("N="+N+": "+seconds[i]+" seconds");
            N *= 2;
        }
    }

    public static void main(String[] args) {
        int firstN = 10000;
        int runs = 5;
        
        System.out.println("Unordered:");
<<<<<<< HEAD
        report(IntSortTest.testSort(new InsertionSorter(), firstN, runs, false), firstN);
        
=======
        report(IntSortTest.testSort(new Quicksort(), firstN, runs, false), firstN);
>>>>>>> 5f9017e9f7b209323fe05f2987e0d8b62d09b7bb
        System.out.println("\nOrdered:");
        report(IntSortTest.testSort(new Quicksort(), firstN, runs, true), firstN);
    }
}
