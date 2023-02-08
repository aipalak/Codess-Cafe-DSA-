import java.util.Scanner;

public class codess_day_2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        for(int i=0;i<=num;i++){
            for(int j=0;j<=i;j++){
                int n=i;
                int r=j;
                int fact=factorial(n)/(factorial(n-r)*factorial(r));
                System.out.print(fact+" ");
            }
            System.out.println();
        }
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
