import java.util.*;
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        outerloop:
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0] = i;                     //storing the required index values
                    ans[1] = j;                     //storing the required index values
                    break outerloop;                //to break the outerloop directly
                }
            }
        }
        return ans;                                 //returning the twoSum index values
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                      
        int[] nums = new int[n];                   
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();                
        }
        int target = sc.nextInt();
        sc.close();
        int[] res = twoSum(nums,target);
        System.out.println(Arrays.toString(res));

    }
}