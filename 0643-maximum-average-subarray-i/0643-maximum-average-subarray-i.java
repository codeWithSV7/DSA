class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int window_sum = 0;
        for(int i =0; i< k; i++){
            window_sum += nums[i];
        }
        double max = window_sum;
        for(int i = k; i<nums.length;i++){
            window_sum += nums[i];
            window_sum -= nums[i-k];
            max = Math.max(max,window_sum);
        }
        return max/k;
    }
}