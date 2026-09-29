class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < (long) m*k) return -1;

        int l=1;
        int r=0;
        for(int i: bloomDay){
            r= Math.max(r, i);
        }

        while(l<r){
            int mid= l+ (r-l)/2;
            int bouqs=0;
            int count=0;

            for(int i: bloomDay){
                if(i<=mid){
                    count++;

                    if(count == k){
                        bouqs++;
                        count=0;
                    }

                } else{
                    count=0;
                }
            }

            if(bouqs>=m){
                r=mid;
            } else{
                l= mid+1;
            }
        } return l;
    }
}