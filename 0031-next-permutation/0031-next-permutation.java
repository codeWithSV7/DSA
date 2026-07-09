class Solution {
    public void nextPermutation(int[] nums) {
        int piv = -1;
        int n = nums.length;
        for(int i= (n - 2); i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                piv = i;
                break;
            }
        }
        if(piv == -1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i = (n - 1); i >= 0; i--){
            if(nums[i] > nums[piv]){
                swap(nums,i,piv);
                break;
            }
        }
        reverse(nums,piv+1,n-1);
        return;
    }
    private void swap(int [] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int [] nums,int left, int right){
        while(left < right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }
}