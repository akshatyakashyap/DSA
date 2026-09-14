class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int s=0;
        int e=0;

        int sum=0;
        int max=0;

        HashSet<Integer> set= new HashSet<>();

        while(e< nums.length){
            sum+= nums[e];

            while(set.contains(nums[e])){
                sum -= nums[s];
                set.remove(nums[s]);
                s++;
                
            }

            set.add(nums[e]);
            max= Math.max(sum, max);
            e++;
        } return max;
    }
}