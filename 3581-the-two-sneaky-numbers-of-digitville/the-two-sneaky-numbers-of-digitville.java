class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();

        int k = 0;

        for (int i : nums) {
            if (set.contains(i)) {
                ans[k] = i;
                k++;
            }
            set.add(i);
        }

        return ans;
    }
}