class Solution {
    private double power(double x, long n){
        if(n == 0){
            return 1.0;
        }
        if(n == 1){
            return x;
        }
        if(n % 2 == 1){
            return x * power(x, n-1);
        }
        return power(x*x,n/2);
    }
    public double myPow(double x, int n) {
         long num = n;
         if(num < 0){
            return power(1/x,-num);
         }
         return power(x,num);
    }
}