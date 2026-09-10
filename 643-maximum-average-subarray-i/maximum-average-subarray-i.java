class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s=0;
        

        double sum=0;
        double maxsum= Integer.MIN_VALUE;

        for(int e=0; e< nums.length; e++){
            sum += nums[e];

            if(e-s+1 == k){
                maxsum= Math.max(maxsum, sum);
                sum -= nums[s];
                s++;
            }
        } return maxsum/k;
    } 
}