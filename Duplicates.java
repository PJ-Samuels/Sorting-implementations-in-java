import java.util.*;
public class Duplicates{
    public static int removeDups(int arr[]) {
        int temp = -1; 
        for( int i = 0; i < arr.length-1; i++){
            if( arr[i] != arr[i+1] ){
                if( temp == -1 ) 
                    continue;
                else
                    arr[temp++] = arr[i+1];
            }
            if( arr[i] == arr[i+1] && temp == -1 )
                temp = i+1;
        }
        for(int j = temp; j < arr.length; j++)
            arr[j] = 0;
        return temp;
    }
    public static void main(String[] args)
    {
        int[] arr = {2, 5, 5, 5, 10, 12, 12};
        int ret = removeDups(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ret);
    }
}