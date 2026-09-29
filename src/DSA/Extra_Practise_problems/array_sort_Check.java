package DSA.Extra_Practise_problems;

import java.util.Arrays;

public class array_sort_Check {
    static boolean is_sort(int[] arr){
        for ( int i=0;i< arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        int arr[]={1,2,5,6,4,3};
        System.out.println(is_sort(arr));



    }
}
