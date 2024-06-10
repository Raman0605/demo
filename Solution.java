import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] == target- nums[i]) {
                    ans[0] = i;
                    ans[1] = j;
                    System.out.println(Arrays.toString(ans));
                }
            }
        }
        return ans;
    }

    public static void main(String args[]){
        Solution solution = new Solution();
        solution.twoSum(new int[]{3, 4, 5, 6},8);


    }
}