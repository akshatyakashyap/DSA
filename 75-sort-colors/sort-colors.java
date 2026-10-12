class Solution {
    public void sortColors(int[] nums) {
        int red0=0;
        int white1=0;
        int blue2=0;

        for(int num: nums){
            if(num == 0) red0++;
            if(num == 1) white1++;
            if(num == 2) blue2++;
        }

        int i=0;

        while(red0-- >0) nums[i++] = 0;
        while(white1-- >0) nums[i++] = 1;
        while(blue2-- >0) nums[i++] = 2;
    }
}
// oo