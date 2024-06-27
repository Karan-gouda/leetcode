class Solution {
    public int lengthOfLastWord(String s) {
        String s2=s.trim();
        int len=s2.length()-1;
           int count=0; 
           if(s2.length()==1){
            return 1;
           } else{   
                while(len>=0){
            if(s2.charAt(len)==' '){
                break;
            }
            else{
                count++;
                len--;
            }
        }
           }

      return count;  
    }
}