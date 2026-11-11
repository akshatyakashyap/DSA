class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int[] ans= new int[n];
        int x=0;

        for(int i=0; i<n; i++){
            int a= 0;
            for(int j=0; j<n; j++){
                if(boxes.charAt(j)=='0') continue;
                else{
                    a+= Math.abs(i-j);
                }

            }

            ans[x]= a;
            x++;
        } return ans;
    }
}