class Solution{
    public int rob(int[] nums) {
        int n=nums.length;
        int prev=nums[0];//i-1
        int prev2=0;//i-2
        for(int i=0;i<n;i++){
            int take=nums[i];
            if(i>1){
                take+=prev2;
            }
            int notPick=0+prev;
            int curri=Math.max(take,notPick);
            prev2=prev;
            prev=curri;
        }
        return prev;
    }
}