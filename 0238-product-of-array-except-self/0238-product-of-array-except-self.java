class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        //creating ans array for storing final values
        int ans[]=new int[n];
        //creating left auxiliary array
        int left[]=new int [n];
        left[0]=1;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        //creating right auxiliary array
        int right[]=new int [n];
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }
        //for final answer
        for(int i=0;i<n;i++){
            ans[i]=right[i]*left[i];
        }
        return ans;
    }
}