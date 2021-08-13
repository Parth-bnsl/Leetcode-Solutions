class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int end = n-1;
        int start = 0;
        while(start < end){
            int sum = numbers[start] + numbers[end];
            if(sum > target){
                end--;
                continue;
            }else if(sum < target){
                start++;
                continue;
            }else{
                return new int[] {start+1,end+1};
            }
        }
        return new int[] {-1,-1};
    }
}
