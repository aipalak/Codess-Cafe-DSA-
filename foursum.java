import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class foursum {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,3,2,3,4,4,4};
        int target = 9;
        List<List<Integer>> sol = four_sum(arr,target);
        for(int i=0;i<sol.size();i++){
            for(int j=0;j<sol.get(i).size();j++){
                System.out.print(sol.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> four_sum(int[] nums,int target){
        ArrayList<List<Integer>> res=new ArrayList<List<Integer>>();
        if(nums.length==0 || nums==null){
            return res;
        }
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int rem=target-nums[i]-nums[j];
                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                    int sum=nums[left]+nums[right];
                    if(sum<rem){
                        left++;
                    }
                    else if(sum>rem){
                        right--;
                    }
                    else{
                        List<Integer> quad=new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[left]);
                        quad.add(nums[right]);
                        res.add(quad);
                        while(left<right && nums[left]==quad.get(2)) left++;
                        while(left<right && nums[right]==quad.get(3)) right--;
                    }
                }
                while(j+1<n && nums[j+1]==nums[j]) j++;
            }
            while(i+1<n && nums[i+1]==nums[i]) i++;
        }
        return res;
    }
}
