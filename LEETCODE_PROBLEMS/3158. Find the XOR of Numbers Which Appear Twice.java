class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int test=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]==nums[i-1]){
                test^=nums[i];
            }
        }
        return test;
    }
}