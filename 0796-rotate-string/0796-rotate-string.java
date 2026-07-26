// class Solution {
//     public boolean rotateString(String s, String goal) {
//         if(s.length() != goal.length()){
//             return false;
//         }
//         String doubled = s+s;
//         return doubled.contains(goal);

//     }
// }

class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        int n = s.length();
        for (int k = 0; k < n; k++) {
            int j = 0;
            while (j < n && s.charAt((k + j) % n) == goal.charAt(j)) {
                j++;
            }
            if (j == n)
                return true;
        }
        return false;
    }
}