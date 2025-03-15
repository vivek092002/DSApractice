package com.takeyouforward.greedyAlgorithms;
//https://takeuforward.org/data-structure/fractional-knapsack-problem-greedy-approach/
import java.util.Arrays;
import java.util.Comparator;

class item{
    int weight;
    int value;
    item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
//creating comparator for sorting  the weights
class itemComparator implements Comparator<item>{
    @Override
    public int compare(item a, item b){
        double r1 = (double)(a.value) / (double)(a.weight);
        double r2 = (double)(b.value) / (double)(b.weight);
        if (r1 < r2){
            return 1;
        } else if (r1 > r2){
            return -1;
        } else {
            return 0;
        }
    }
}
public class fractionalKnapsackProblem {
    public static double knapsackProblem(int n, item[] arr, int wt) {
        Arrays.sort(arr, new itemComparator());
        int currWeight = 0;
        double totalValue = 0;
        for (int i = 0; i < n; i++) {
            if (currWeight + arr[i].weight <= wt){
                currWeight += arr[i].weight;
                totalValue += arr[i].value;

            } else {
                int remain = wt - currWeight;
                totalValue = (double) (arr[i].value) / (double) (arr[i].weight) * (double) remain;
                break;
            }
        }
        return totalValue;
    }
    public static void main(String[] args) {
        int n = 3;
        int wt = 50;
        item[] arr = {new item(100,20), new item(60,10), new item(120,30)};
        double ans = knapsackProblem(n,arr,wt);
        System.out.println("Maximum value is : " + ans);
    }
}
