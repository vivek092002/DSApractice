package com.takeyouforward.graphs;

//Initial Configuration:
//Queue data structure: follows FIFO, and will always contain the starting.
//Visited array: an array initialized to 0
//In BFS, we start with a “starting” node, mark it as visited, and push it into the queue data structure.
//In every iteration, we pop out the node ‘v’ and put it in the solution vector, as we are traversing this node.
//All the unvisited adjacent nodes from ‘v’ are visited next and are pushed into the queue.
// The list of adjacent neighbors of the node can be accessed from the adjacency list.
//Repeat steps 2 and 3 until the queue becomes empty, and this way you can easily traverse all the nodes in the graph.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution{
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> qu = new LinkedList<>();
        boolean[] visited = new boolean[V];
        qu.add(0);
        visited[0] = true;

        while (!qu.isEmpty()){
            Integer node = qu.poll();
            bfs.add(node);

            for (Integer it : adj.get(node)){
                if (!visited[it]){
                    visited[it] = true;
                    qu.add(it);
                }
            }
        }
        return bfs;
    }
}

public class BFSTraversal {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

        Solution s1 = new Solution();
        ArrayList<Integer> ans = s1.bfsOfGraph(5,adj);
        for (int st : ans){
            System.out.print(st + " ");
        }
    }
}
