class Solution {
    public boolean isPalindrome(int x) {
        
            int temp=x;
            int re;
            int f=0;
            while(temp>0){
                re=temp%10;
                temp=temp/10;
                f=f*10+re;

            }
            if(f==x)
            return true;

        
        else
            return false;

        
        
    }
}