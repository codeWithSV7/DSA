class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for(String sentence :sentences){
            int count = 1;
            for(int ch : sentence.toCharArray()){
                if(ch == ' '){
                    count++;
                }
            } 
            maxCount = Math.max(maxCount,count);

        }
        return maxCount;
    }
}