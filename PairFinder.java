//import java.util.*;
public class PairFinder {

    public static void findPairSums(int k, int[] arr)
    {
        System.out.println("Find Pairs Sum");
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if (arr[i] + arr[j] == k)
                    System.out.println(arr[i]+"+"+arr[j]+" = 12");
            }
        }
    }
    public static void findPairSumsFaster(int k, int[] arr) {
        System.out.println("Find Pairs Sum Faster");
        Sort2.quickSort(arr);
        int i = 0;
        int j = arr.length-1;
        while (i < j) {
            if (arr[i] + arr[j] == k) {
                System.out.println(arr[i]+"+"+arr[j]+" = 12");
                i++;
                j--;
            }
            else if ((arr[i]+arr[j]) < k)
                i++;
            else
                j--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 4, 7, 7, 8, 5, 15};
        findPairSums(12, arr);
        findPairSumsFaster(12, arr);
    }
}
