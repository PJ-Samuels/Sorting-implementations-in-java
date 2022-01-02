import java.util.*;
public class MergeIntersect {
    public static int[] intersect(int[] arr1, int[] arr2)
    {
        int length;
        if(arr1.length < arr2.length)
            length = arr1.length;
        else 
            length = arr2.length;
        int[] ans = new int[length];     
        int count = 0;

        for(int i = 0; i < arr1.length;i++)
        {
            for(int j = 0; j < arr2.length-1;j++)
            {
                if(arr1[i] == arr2[j] && !(check(ans, arr1[i]))){
                    ans[count] = arr1[i];
                    count++;
                    break;
                }
                else if(arr1[i]== 0 && arr2[j] == 0)
                {
                    ans[count] = arr1[i];
                    count++;
                    break;
                }
            }
        }
        return ans;
    }
    public static boolean check(int[] arr, int c)
    {
        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i] == c)
                return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        int[] a1 = {0, 2, -4, 6, 10, 8};
        int[] a2 = {12, 0, -4, 8};
        Sort2.mergeSort(a1);
        Sort2.mergeSort(a2);
        // System.out.println(Arrays.toString(a1));
        // System.out.println(Arrays.toString(a2));
        int[] result = MergeIntersect.intersect(a1, a2);
        System.out.println( Arrays.toString(result) );
    }
}
