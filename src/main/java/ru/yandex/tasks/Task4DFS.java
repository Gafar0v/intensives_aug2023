// Extra task https://leetcode.com/problems/validate-binary-tree-nodes/

package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4DFS {
    public static void runSearch(int[][] tree, int node, List<Integer> order) {
        /*
         * Реализация dfs
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        if (tree[node][0] != -1) runSearch(tree, tree[node][0], order);
        if (tree[node][1] != -1) runSearch(tree, tree[node][1], order);
        order.add(node);

    }

    public static int[] getDFSOrder(int[][] tree, int root) {
        List<Integer> order = new ArrayList<>();
        runSearch(tree, root, order);
        int[] dfsOrder = new int[order.size()];
        for (int i = 0; i < order.size(); i++) {
            dfsOrder[i] = order.get(i);
        }
        return dfsOrder;
    }

    public static void selfCheck() {
        int[][] tree =
                {
                        {1, 6},
                        {2, 3},
                        {-1, -1},
                        {4, -1},
                        {-1, -1},
                        {-1, -1},
                        {-1, 8},
                        {-1, -1},
                        {-1, -1}
                };

        int[] ans1 = {2, 4, 3, 1, 8, 6, 0};
        int[] ans2 = {4, 3};
        int[] ans3 = {2};
        int[] ans4 = {8, 6};

        assert (Arrays.equals(getDFSOrder(tree, 0), ans1));
        assert (Arrays.equals(getDFSOrder(tree, 3), ans2));
        assert (Arrays.equals(getDFSOrder(tree, 2), ans3));
        assert (Arrays.equals(getDFSOrder(tree, 6), ans4));
    }
}
