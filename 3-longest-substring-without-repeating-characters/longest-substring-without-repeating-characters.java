class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set= new HashSet<>();

        int st=0;
        int e=0;
        int ans=0;

        while(e< s.length()){

            while(set.contains(s.charAt(e))){
                set.remove(s.charAt(st));
                st++;
            }

            set.add(s.charAt(e));

            ans= Math.max(ans, e-st+1);

            e++;
        }
        return ans;
    }
}