class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int max = Integer.MAX_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i + k - 1 < n) {
                int diff = nums[k - 1 + i] - nums[i];
                if (diff < max) {
                    max = diff;
                }
            }
        }

        return max;
    }
}