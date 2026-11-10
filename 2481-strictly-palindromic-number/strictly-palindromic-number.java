class Solution {
    public boolean isStrictlyPalindromic(int n) {
        
        for(int i=2; i<= n-2; i++){
            String c= Integer.toString(n,i);

            int left=0;
            int right= c.length()-1;

            while(left<right){
                if(c.charAt(left)!= c.charAt(right)) return false;
                left++;
                right--;
            }
        } return true;
    }
}