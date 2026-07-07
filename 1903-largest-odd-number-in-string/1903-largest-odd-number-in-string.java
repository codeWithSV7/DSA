class Solution {
    public String largestOddNumber(String num) {
        int n =num.length();
        int start = 0;
        while(start < n && num.charAt(start) == '0'){
            start++;
        }
        for(int i = (n-1); i >= 0; i--){
            int d = num.charAt(i) -'0';
            if(d % 2 == 1){
                return num.substring(start, i+1);
            }
        }
        return "";    
    }
}