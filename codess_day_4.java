import java.util.Scanner;

public class codess_day_4 {
    public static void main(String[] args) {
        int csum=0;
        int osum=0;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=scn.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            if(csum>=0){
                csum+=arr[i];
            }
            else{
                csum=arr[i];
            }
            if(csum>osum){
                osum=csum;
            }
        }
        System.out.println("Max sum is "+csum);
    }
}
