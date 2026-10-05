class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();

        gene("", 0,0, n, ans);
        return ans;
    }

    public void gene(String s, int start, int end, int n, List<String> ans){
        if(s.length()== 2*n){
            ans.add(s);
            return;
        }

        if(start< n){
            gene(s+ "(", start+1, end, n, ans);
        }

        if(end< start){
            gene(s+ ")", start, end+1, n, ans);
        }
    }
}