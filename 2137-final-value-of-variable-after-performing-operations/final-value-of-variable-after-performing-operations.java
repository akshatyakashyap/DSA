class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(int i=0; i<operations.length; i++){
            String op= operations[i];
            if(op.equals("X++") || op.equals("++X")) {ans++;}
            else{ans--;}
        } return ans;
    }
}