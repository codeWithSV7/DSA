class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < s.length();i++){
            char ch = s.charAt(i);
            if(str.length() == 0 || str.charAt(str.length() - 1)!= ch){
                str.append(ch);
            }
            else if(str.charAt(str.length() - 1) == ch){
                str.deleteCharAt(str.length() - 1);
            }

        }
        return str.toString();
    }
}