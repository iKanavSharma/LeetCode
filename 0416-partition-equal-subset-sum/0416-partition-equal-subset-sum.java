class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2!=0)
            return false;
        else{
            int W=sum/2;
            int dp[][]=new int[n+1][W+1];
            for(int i=1;i<n+1;i++){
                for(int j=1;j<W+1;j++){
                    if(nums[i-1]<=j)
                        dp[i][j]=Math.max(nums[i-1]+dp[i-1][j-nums[i-1]],dp[i-1][j]);
                    else
                        dp[i][j]=dp[i-1][j];
                }
            }
            int sum1=dp[n][W];
            int sum2=sum-sum1;
            if(sum1==sum2)
                return true;
            else
                return false;
        }
    }
}