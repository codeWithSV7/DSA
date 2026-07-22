// class Solution {
//     public int[] dailyTemperatures(int[] temp) {
//         int [] res = new int[temp.length];
//         Stack<Integer> stack = new Stack<>();
//         for(int i = temp.length-1;i>=0;i--){
//             while(!stack.isEmpty() && temp[i] >= temp[stack.peek()]){
//                 stack.pop();
//             }
//             int nextT = stack.isEmpty() ? 0 : stack.peek();
//             res[i] = nextT;
//             stack.push(i);
//         }
//         return res;
//     }
// }
import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>(); 
        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }

           
            if (!stack.isEmpty()) {
                res[i] = stack.peek() - i;
            } else {
                res[i] = 0;
            }

            
            stack.push(i);
        }

        return res;
    }
}