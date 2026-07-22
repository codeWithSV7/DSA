class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = nums2.length-1;i>=0;i--){
            while(!stack.isEmpty() && nums2[i] >= stack.peek()){
                stack.pop();
            }
            int nextG = stack.isEmpty()?-1:stack.peek();
            map.put(nums2[i],nextG);
            stack.push(nums2[i]);
        }
        for(int i = 0; i < nums1.length;i++){
            nums1[i] =map.get(nums1[i]);
        }
        return nums1;
    }
}