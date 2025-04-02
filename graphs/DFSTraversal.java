package com.takeyouforward.graphs;

import java.util.ArrayList;

public class DFSTraversal {

    public static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
        visited[node] = true;
        ls.add(node);

        for(Integer it: adj.get(node)) {
            if(!visited[it]) {
                dfs(it, visited, adj, ls);
            }
        }
    }

    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[V];
        visited[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0,visited,adj,ls);
        return ls;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);

        ArrayList<Integer> ans = dfsOfGraph(5,adj);
        for (int it : ans){
            System.out.print(it + " ");
        }
    }
}
