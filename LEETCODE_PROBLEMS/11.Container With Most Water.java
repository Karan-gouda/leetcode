class Solution {
    public int maxArea(int[] arr) {
        int left=0,right=arr.length-1,max=0;  
        while(left<right){
            while (left < right) {
            int curr = Math.min(arr[left], arr[right]) * (right - left);
            max = Math.max(max, curr);

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

       
    }
     return max;
}
}