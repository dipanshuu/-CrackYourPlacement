class Solution {
    public boolean isPowerOfTwo(int n) {
        int a=2;int x=0;
       if(n<=(int)Math.pow(2,31)-1){
            if(n==1){
            return true;
        }
        while(a<=n){
            a=(int)Math.pow(2,x);
            if(a==n){
                return true;
            }
            x=x+1;
        }
        return false;
       }
       return false;
    }
}