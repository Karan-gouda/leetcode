class Solution {
    public int romanToInt(String s) {
        int[] arr=new int[s.length()];
        int sum=0;
        int sum1=0;
        int res=0;
      float t;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
            arr[i]=1;
            sum+=1;
            }
            else if(s.charAt(i)=='V'){
            arr[i]=5;
            sum+=5;
            }
            else if(s.charAt(i)=='X'){
            arr[i]=10;
            sum+=10;
            }
            else if(s.charAt(i)=='L'){
            arr[i]=50;
            sum+=50;
            }
            else if(s.charAt(i)=='C'){
            arr[i]=100;
            sum+=100;
            }
            else if(s.charAt(i)=='D'){
            arr[i]=500;
            sum+=500;
            }
            else if(s.charAt(i)=='M'){
            arr[i]=1000;
            sum+=1000;
            }
            

        }
        for(int i=0;i<s.length()-1;i++){
            
            if((arr[i]==1 || arr[i]==10 || arr[i]==100)&& ((arr[i]!=arr[i+1]) && (arr[i]<arr[i+1]))){
                t=arr[i+1]/10;
            if(arr[i]>=t){
                res=2*arr[i];
                sum1+=res;
                
            }
            }
           
        }
        return sum-sum1;
        
    }
}