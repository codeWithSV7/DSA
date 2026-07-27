class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int l = nums.length;
        int len = (l*(l+1))/2;
        for(int n : nums){
            sum += n;
        }
        int number = len - sum;
        return number;
    }
}