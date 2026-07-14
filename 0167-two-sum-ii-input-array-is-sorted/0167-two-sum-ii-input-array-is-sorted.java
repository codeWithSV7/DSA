class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();

        int cur = 0; int x = 0;
        for(int i = 0; i < numbers.length ; i++){
            cur = numbers[i];
            x = target - cur;
            if(map.containsKey(x)){
                return new int[] {map.get(x)+1, i+1};
            }
            map.put(cur, i);
        }
        return null;
    }
}