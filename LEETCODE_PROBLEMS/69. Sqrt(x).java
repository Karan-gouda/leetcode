class Solution {
    public int mySqrt(int x) {

        if(x==1 || x==0){
             return x;
        }
        long l=1,r=x;
            while(l<=r){
           
            long m=l+(r-l)/2;
            if(m*m==x){
                return (int)m;
            }
            else if(m*m<x){
                l=m+1;
            }
            else{
                r=m-1;
            }
            }
        
        
        return (int) r;
    }
}