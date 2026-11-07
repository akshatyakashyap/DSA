class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans= new int[nums.length];
        int k=0;

        for(int i: nums){
            if(i%2 == 0) ans[k]=0;
            else ans[k]=1;

            k++;
        }

        Arrays.sort(ans);
        return ans;
    }
}