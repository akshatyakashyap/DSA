class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,1);

        int count= 0;
        int s=0;

        for(int i=0; i< nums.length; i++){
            if(nums[i]%2 != 0){
                s++;
            }

            if(map.containsKey(s-k)){
                count+= map.get(s-k);
            }
            map.put(s,map.getOrDefault(s, 0)+1);
        } return count;
    }
}