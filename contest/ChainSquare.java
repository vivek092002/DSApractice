package com.takeyouforward.contest;

import java.util.*;

public class ChainSquare {

    public static int maxScore(int N, int[] A) {
        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            tree.add(new ArrayList<>());
        }

        // Build the tree from the input array
        for (int i = 0; i < A.length; i++) {
            tree.get(A[i]).add(i + 2);  // Nodes are 1-based indexed
        }

        return dfs(1, tree);  // Start DFS from the root node (1)
    }

    private static int dfs(int node, List<List<Integer>> tree) {
        List<Integer> chainLengths = new ArrayList<>();

        // Traverse all child nodes
        for (int child : tree.get(node)) {
            chainLengths.add(dfs(child, tree));
        }

        // If it's a leaf node, return chain length as 1
        if (chainLengths.isEmpty()) {
            return 1;
        }

        // Sort chain lengths in descending order for optimal break decisions
        Collections.sort(chainLengths, Collections.reverseOrder());

        int maxChain = chainLengths.get(0) + 1; // Longest chain we can get including this node
        int score = 0;

        // Compute the score for all chains
        for (int len : chainLengths) {
            score += len * len;
        }

        // Return the best possible chain length to be used in upper levels
        return maxChain;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Number of test cases

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N - 1];
            for (int i = 0; i < N - 1; i++) {
                A[i] = sc.nextInt();
            }
            System.out.println(maxScore(N, A));
        }
        sc.close();
    }
}
