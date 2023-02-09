import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class armstrong {
    static int idx1,idx2;
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int[] arr={1,3,5,4,2};
        next_per(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void next_per(int[] arr){
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                idx1=i;
                break;
            }
        }
        for(int j=arr.length-1;j>=0;j--){
            if(arr[j]>arr[idx1]){
                idx2=j;
                break;
            }
        }
        swap(arr,idx1,idx2);
        reverse(arr,idx1+1, arr.length-1);
    }
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverse(int[]arr,int start,int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
