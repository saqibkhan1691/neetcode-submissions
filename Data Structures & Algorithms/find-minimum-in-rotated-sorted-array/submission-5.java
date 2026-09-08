class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low=0;
        int high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if((mid==0 || nums[mid-1]>nums[mid]) && (mid==nums.length-1 || nums[mid]<nums[mid+1])){
                return nums[mid];
            }

            if(nums[mid]>nums[high]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}
