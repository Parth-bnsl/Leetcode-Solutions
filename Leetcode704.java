class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(end >= start){
            int middle =  start + (end - start)/2;
            if(nums[middle] == target)
                return middle;
            else if(nums[middle] > target){
                end = middle-1;
                continue;
            }else
                start = middle + 1;
        }
        return -1;
    }
}
