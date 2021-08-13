class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sqr = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for(int i=nums.length - 1;i >=0;i--){
            int lower = nums[left]*nums[left];
            int higher = nums[right]*nums[right];
            if(lower > higher){
                sqr[i] = lower;
                left++;
            }else{
                sqr[i] = higher;
                right--;
            }
        }
        return sqr;
    }
}
