class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int cost=0;
        int m= costs.length/2;

        Arrays.sort(costs, (a,b) -> (a[1]-a[0])-(b[1]-b[0]));

        for(int i=0; i< costs.length; i++){
            if(i<m) cost+= costs[i][1];
            else cost+= costs[i][0];
        } return cost;
    }
}