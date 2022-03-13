//package
import java.util.Arrays;

import java.util.Arrays;
public class ArraySort {
    public static int Search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr=new int[]{12,5,7,8,65};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        int indexvalue=Search(arr, 8);
        if(indexvalue==-1)
        System.out.println("elements not found");
        else
        System.out.println("element is found "+indexvalue);
    }
}
