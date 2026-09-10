class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int s=0;
        int e=0;
        int ans=0;
        int sum=0;

        while(e< arr.length){
            sum += arr[e];
            e++;

            if(e-s>k){
                e++;
            }
            else if(e-s == k){
                if(sum/k >= threshold) ans++;
                sum -= arr[s];
                s++;
            }
        } return ans;
    }
}