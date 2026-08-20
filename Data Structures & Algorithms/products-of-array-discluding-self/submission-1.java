class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] LR = new int[n];
        int[] RL = new int[n];
        int[] result = new int[n];

        LR[0] = 1;
        for(int i=1; i<n; i++){
            LR[i] = LR[i-1] * nums[i-1];
        }

        RL[n-1] = 1;
        for(int j=n-2; j>=0; j--){
            RL[j] = RL[j+1] * nums[j+1];
        }

        for(int i=0; i<n; i++){
            result[i] = LR[i] * RL[i];
        }
        return result;
    }
}  
