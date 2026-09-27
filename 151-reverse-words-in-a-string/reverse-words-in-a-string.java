class Solution {
    public String reverseWords(String s) {
       String t= s.trim();
       String[] sent= t.split("\\s+");

        int left=0;
        int right= sent.length -1;

        while(left<right){
            String temp= sent[left];
            sent[left]= sent[right];
            sent[right]= temp;
            left++;
            right--;
        }
       return String.join(" ", sent);
    }
}