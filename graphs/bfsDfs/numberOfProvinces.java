package com.takeyouforward.graphs.bfsDfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class numberOfProvinces{

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjList, boolean[] visited){
        visited[node] = true;
        for (Integer it : adjList.get(node)){
            if (!visited[it]){
                dfs(it, adjList, visited);
            }
        }
    }

    public static int findNoOfProvinces(ArrayList<ArrayList<Integer>> adj, int v){

        //change matrix to adjacency list
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }

        //changed matrix to list
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (adj.get(i).get(j) == 1 && i!=j){
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }

        boolean[] visited = new boolean[v];
        int count = 0;
        for (int i = 0; i < v; i++) {
            if (!visited[i]){
                count++;
                dfs(i, adjList, visited);
            }
        }
        return count;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(br.readLine());

        //input matrix as arraylist
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            String[] values = br.readLine().split(" ");
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < v; j++) {
                temp.add(Integer.parseInt(values[j]));
            }
            adj.add(temp);
        }

        System.out.println(findNoOfProvinces(adj,v));
    }
}
