package arrays;

public class secondSmallest {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {1,8,4,7,7,5};

        int smallest = arr[0];
        int ssmallest = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < ssmallest && arr[i] != smallest){
                ssmallest = arr[i];
            }
        }
        System.out.println(ssmallest);
    }
}
