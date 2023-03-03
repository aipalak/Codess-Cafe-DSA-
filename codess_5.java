import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class codess_5 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scn.nextInt();
        }
        int max=longestConsSub(nums);
        System.out.println(max);
    }
    public static int longestConsSub(int[] arr){
        Set<Integer> hashset=new HashSet<Integer>();
        for(int num:arr){
            hashset.add(num);
        }
        int longestsub=0;
        for(int num:arr){
            if(!hashset.contains(num-1)){
                int currnum=num;
                int currstreak=1;
                while(hashset.contains(num+1)){
                    num++;
                    currstreak++;
                }
                longestsub=Math.max(currstreak,longestsub);
            }
        }
        return longestsub;
    }
}
