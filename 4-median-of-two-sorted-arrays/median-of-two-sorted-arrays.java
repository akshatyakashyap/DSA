class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m= nums1.length, n= nums2.length;
        int[] merge= new int[m + n];

        for(int i=0; i < m; i++){
            merge[i] = nums1[i];
        } for(int i=0; i < n; i++) {
            merge[m+i] = nums2[i];
        }

        Arrays.sort(merge);

        int l= merge.length;

        if(l%2 == 1) return merge[l/2];
        return (merge[l/2 - 1] + merge[l/2] )/ 2.0;
    }
} //did using normal merge and sort, should be done using binary search 