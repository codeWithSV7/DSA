class Solution {
    public long power(long x, long n, long mod){
        long ans = 1;
        while(n > 0){
            if(n % 2 == 0){
                x = (x*x)%mod;
                n = n/2;
            }
            else{
                ans = (ans*x)%mod;
                n-= 1;
            }
        }
        return ans;
    } 
    public int countGoodNumbers(long n) {
        if(n==1) return 5;
        long even = (n+1)/2;
        long odd = n/2;
        long mod = 1000000007;
        return (int)((power(5,even,mod))*(power(4,odd,mod))%mod);
    }
}