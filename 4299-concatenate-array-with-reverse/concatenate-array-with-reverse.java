class Solution {
    //??
    public int[] concatWithReverse(int[] nums) {
        int n= nums.length;
        int[] ans= new int[2*n];

        for(int i=0; i< n; i++){
            ans[i] = nums[i];
        }
        for(int j= 0; j<n; j++){
            ans[n+j] = nums[n-1-j];
        }
        return ans;
    }
}