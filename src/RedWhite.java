import edu.princeton.cs.algs4.Graph;

public class RedWhite {

    public static int count(Graph G, int[] rednodes) {
        int rw_count = 0;


        for (int rednode : rednodes) {
          for (Integer integer : G.adj(rednode)) {
              if (marked(integer, rednodes)) {
                  rw_count++;
              }
          }
        }

        // Count how many of the edges in G connect a white node (one that
        // isn't in rednodes) with a red node (one that is in rednodes).

        return rw_count;
    }
    public static boolean marked(int check, int[] rednode) {
        for (int i = 0; i < rednode.length; i++) {
            if (check == rednode[i]) {
                return false;
            }

        }
        return true;

    }

}
