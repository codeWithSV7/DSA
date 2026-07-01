class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;
        while(i < n && s.charAt(i) == ' '){
            i++;
        }
        int sign = 1;
        if(i < n && s.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        else if(i < n && s.charAt(i) == '+'){
            i++;
        }
        long num = 0;
        while(i < n && Character.isDigit(s.charAt(i))){
            num = num * 10 + (s.charAt(i) - '0');
            i++;
            if(num * sign <= Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            if(num * sign >= Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
        }
        return (int)(num * sign);
    }
}