package com.takeyouforward.contest;

import java.util.*;

public class KnightMoves {
    static class Position {
        int x, y, steps;
        Position(int x, int y, int steps) {
            this.x = x;
            this.y = y;
            this.steps = steps;
        }
    }

    public static int minMoves(int n, int startRow, int startCol, int endRow, int endCol) {
        int[][] moves = {
                {2, 1}, {2, -1}, {-2, 1}, {-2, -1},
                {1, 2}, {1, -2}, {-1, 2}, {-1, -2}
        };
        if (startRow == endRow && startCol == endCol) return 0;
        Queue<Position> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        queue.add(new Position(startRow, startCol, 0));
        visited[startRow][startCol] = true;
        while (!queue.isEmpty()) {
            Position current = queue.poll();

            for (int[] move : moves) {
                int newX = current.x + move[0];
                int newY = current.y + move[1];

                if (newX == endRow && newY == endCol) {
                    return current.steps + 1;
                }

                if (newX >= 0 && newX < n && newY >= 0 && newY < n && !visited[newX][newY]) {
                    visited[newX][newY] = true;
                    queue.add(new Position(newX, newY, current.steps + 1));
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 6; // Chessboard size
        int startX = 5, startY = 1;
        int endX = 0, endY = 5;

        System.out.println(minMoves(n, startX, startY, endX, endY)); // Output the minimum moves
    }
}
