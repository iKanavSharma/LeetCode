class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=Integer.MAX_VALUE;
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[low]<=nums[mid]){//sorted part
                ans=Math.min(ans,nums[low]);
                low=mid+1;
            }else{//right part is sorted
                high=mid-1;
                ans=Math.min(ans,nums[mid]);
            }
        }
        return ans;
    }
}