class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> a= new HashSet<>();
        int ans=0;

        for(int c=0; c< s.length(); c++){
            if(!a.contains(s.charAt(c))){
                a.add(s.charAt(c));
                ans++;
            }
        } return ans;
    }
}