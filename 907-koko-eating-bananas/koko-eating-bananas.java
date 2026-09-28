class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int p: piles){
            r= Math.max(r,p);
        }

        while(l<r){
            int m= (l+r)/2;

            int sum=0;
            for(int i=0; i< piles.length; i++){
                sum += (piles[i]+ m -1)/m;
            }
            if(sum<=h){
                r= m;
            } else {
                l= m+1;
            }
        } return l;
        //MORE PRAC WTF WAS THAT
    }
}