class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return i;
            }
        }
        if(target>nums[nums.length-1]){
            return nums.length;

        }
        else{
            for(int i=0;i<nums.length;i++){
                if(target+1==nums[i]){
                    return i;

                }
            } for(int i=0;i<nums.length;i++){
                if(target-1==nums[i] ){
                    return i+1;
                }
            }
            
        }

        return 0;
    }
}