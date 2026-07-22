class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiants = new LinkedList<>();
        Queue<Integer> dires = new LinkedList<>();
        int n = senate.length();
        for(int i = 0; i < senate.length(); i++){
            if(senate.charAt(i) == 'R') radiants.offer(i);
            else dires.offer(i); 
        }
        while(!radiants.isEmpty() && !dires.isEmpty()){
            int r = radiants.poll();
            int d = dires.poll();
            if(r < d) radiants.offer(r+n);
            else dires.offer(d + n);
        }
        return radiants.isEmpty()?"Dire":"Radiant";
    }
}