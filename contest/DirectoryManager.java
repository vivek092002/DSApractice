package com.takeyouforward.contest;

import java.util.*;

class Directory {
    String name;
    Directory parent;
    Map<String, Directory> children;

    Directory(String name) {
        this.name = name;
        this.parent = null;
        this.children = new HashMap<>();
        DirectoryManager.totalNodes++;
    }
}

public class DirectoryManager {
    static int totalNodes = 0;
    static Directory root = new Directory("root");

    public static Directory getNode(String path) {
        String[] parts = path.split("/");
        if (!parts[0].equals("root")) return null;
        Directory current = root;
        for (int i = 1; i < parts.length; i++) {
            if (!current.children.containsKey(parts[i])) {
                return null;
            }
            current = current.children.get(parts[i]);
        }
        return current;
    }

    public static int subtreeSize(Directory dir) {
        int size = 1;
        for (Directory childDir : dir.children.values()) {
            size += subtreeSize(childDir);
        }
        return size;
    }

    public static boolean isAncestor(Directory potentialAncestor, Directory potentialDescendant) {
        Directory current = potentialDescendant.parent;
        while (current != null) {
            if (current == potentialAncestor) return true;
            current = current.parent;
        }
        return false;
    }

    public static Directory copySubtree(Directory sourceDir) {
        Directory copiedDir = new Directory(sourceDir.name);
        for (Map.Entry<String, Directory> childEntry : sourceDir.children.entrySet()) {
            Directory copiedChild = copySubtree(childEntry.getValue());
            copiedDir.children.put(childEntry.getKey(), copiedChild);
            copiedChild.parent = copiedDir;
        }
        return copiedDir;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialEntries = scanner.nextInt(), queries = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < initialEntries; i++) {
            String[] inputTokens = scanner.nextLine().trim().split(" ");
            Directory parentDir = getNode(inputTokens[0]);
            if (parentDir != null) {
                for (int j = 1; j < inputTokens.length; j++) {
                    if (!parentDir.children.containsKey(inputTokens[j])) {
                        Directory newChildDir = new Directory(inputTokens[j]);
                        newChildDir.parent = parentDir;
                        parentDir.children.put(inputTokens[j], newChildDir);
                    }
                }
            }
        }

        for (int i = 0; i < queries; i++) {
            String[] inputTokens = scanner.nextLine().trim().split(" ");
            String command = inputTokens[0];

            if (command.equals("countDescendants")) {
                Directory targetDir = getNode(inputTokens[1]);
                System.out.println(targetDir == null ? "Invalid command" : subtreeSize(targetDir) - 1);

            } else if (command.equals("cutPaste")) {
                Directory sourceDir = getNode(inputTokens[1]);
                Directory destinationDir = getNode(inputTokens[2]);
                if (sourceDir == null || destinationDir == null || sourceDir == destinationDir ||
                        isAncestor(sourceDir, destinationDir) || destinationDir.children.containsKey(sourceDir.name) ||
                        sourceDir.parent == null) {
                    System.out.println("Invalid command");
                } else {
                    sourceDir.parent.children.remove(sourceDir.name);
                    sourceDir.parent = destinationDir;
                    destinationDir.children.put(sourceDir.name, sourceDir);
                    System.out.println("OK");
                }

            } else if (command.equals("copyPaste")) {
                Directory sourceDir = getNode(inputTokens[1]);
                Directory destinationDir = getNode(inputTokens[2]);
                if (sourceDir == null || destinationDir == null || sourceDir == destinationDir ||
                        isAncestor(sourceDir, destinationDir) || destinationDir.children.containsKey(sourceDir.name)) {
                    System.out.println("Invalid command");
                } else {
                    int sizeToCopy = subtreeSize(sourceDir);
                    if (totalNodes + sizeToCopy > 1_000_000) {
                        System.out.println("Invalid command");
                    } else {
                        Directory copiedSubtree = copySubtree(sourceDir);
                        copiedSubtree.parent = destinationDir;
                        destinationDir.children.put(copiedSubtree.name, copiedSubtree);
                        System.out.println("OK");
                    }
                }
            }
        }
    }
}