class Solution {
    public void moveZeroes(int[] nums) {
        int insert_index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[insert_index]=nums[i];
                insert_index++;
            }
        }
        while(insert_index<nums.length){
            nums[insert_index]=0;
            insert_index++;
        }
    }