class Solution {
    public int[] sortedSquares(int[] nums) {
        int resultant[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        int p1=0;
        int p2=nums.length-1;
        for(int pos=nums.length-1;pos>=0;pos--){
            if(nums[p1]>nums[p2]){
                resultant[pos]=nums[p1];
                p1++;
            }
            else{
                resultant[pos]=nums[p2];
                p2--;
            }
        }
        return resultant;
    }
}