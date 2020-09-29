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
        report(IntSortTest.testSort(new Quicksort(), firstN, runs, false), firstN);
        System.out.println("\nOrdered:");
        report(IntSortTest.testSort(new Quicksort(), firstN, runs, true), firstN);
    }
}
