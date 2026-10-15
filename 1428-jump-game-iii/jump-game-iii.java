class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited= new boolean[arr.length];
        return jump(arr, start, visited);
    }

    public boolean jump(int[] arr, int i, boolean[] visited){
        if(i<0|| i>=arr.length|| visited[i]) return false;
        if(arr[i]==0) return true;


        visited[i]= true;

        return jump(arr, i+arr[i], visited)|| jump(arr, i-arr[i], visited);
    }
}