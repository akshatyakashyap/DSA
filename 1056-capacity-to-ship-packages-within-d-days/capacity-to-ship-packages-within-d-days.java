class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=0;
        int r=0;
        for(int w: weights){
            l= Math.max(l,w);
            r+= w;
        }

        while(l<r){
            int m= (l+r)/2;

            int din=1;
            int sum=0;
            for(int w: weights){
                if(sum+w> m){
                    din++;
                    sum=w;
                } else {
                    sum+= w;
                }
            }

            if(din>days){
                l= m+1;
            } else{
                r=m;
            }
        } return l;
    }
}