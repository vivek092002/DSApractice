package arrays;

public class secondLargest {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {1,2,4,7,7,5};

        int largest = arr[0];
        int slargest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] >  largest){
                largest = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > slargest && arr[i] != largest){
                slargest = arr[i];
            }
        }
        System.out.println(slargest);
    }
}
