
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++) {
            int ls = 0, rs = 0;

            for(int j = 0; j < n; j++) {
                if(j < i) {
                    ls += nums[j];
                }
                else if(j > i) {
                    rs += nums[j];
                }
            }

            ans[i] = Math.abs(ls - rs);
        }

        return ans;
    }
}
