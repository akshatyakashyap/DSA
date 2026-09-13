class Solution {
    public int longestSubarray(int[] nums) {

        int s=0;
        int e=0;
        
        int ans=0;
        int zeros=0;

        while(e< nums.length){
            if(nums[e]== 0){  
                zeros++;
            }
            while(zeros>1){      
                if(nums[s]==0){
                    zeros--;
                } 
                s++;
            } 
            ans= Math.max(ans, e-s);
            e++;
        } return ans;
    }
}