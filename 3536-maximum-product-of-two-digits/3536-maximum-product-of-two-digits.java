// class Solution {
//     public int maxProduct(int n) {
//         int first = n%10;
//         n /= 10;
//         int second = n%10;
//         n /= 10;

//         if(second > first){
//             int temp = first;
//             first = second;
//             second = temp;
//         }
//         while(n > 0){
//             int a = n%10;
//             n /= 10;

//             if(a > first){
//                 second = first;
//                 first = a;
//             }else if (a > second){
//                 second = a;
//             }
//         }
//         return first*second;
//     }
// }class Solution {
//     public int maxProduct(int n) {
//         int first = n%10;
//         n /= 10;
//         int second = n%10;
//         n /= 10;

//         if(second > first){
//             int temp = first;
//             first = second;
//             second = temp;
//         }
//         while(n > 0){
//             int a = n%10;
//             n /= 10;

//             if(a > first){
//                 second = first;
//                 first = a;
//             }else if (a > second){
//                 second = a;
//             }
//         }
//         return first*second;
//     }
// }

class Solution {
    public int maxProduct(int n) {
        int[] map = new int[10];
        while (n > 0) {
            map[n%10]++;
            n /= 10;
        }
        int res = 1;
        int cnt = 0;
        for (int i = 9; i >= 0; i--) {
            if (map[i] >= 2 && cnt == 0) {
                return i * i;
            } else if (map[i] > 0) {
                res *= i;
                cnt++;
            }
            if (cnt == 2) {
                break;
            }
        }
        return res;
    }
}