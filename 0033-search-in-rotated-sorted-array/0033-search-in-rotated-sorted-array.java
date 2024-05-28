class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int strt=0;
        int end=n-1;
        while(strt<=end){
            int mid=(strt+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            //left half is sorted
            if(nums[strt]<=nums[mid]){
                if(nums[strt]<=target && target<=nums[mid]){
                    end=mid-1;
                }else{
                    strt=mid+1;
                }
                //right half is sorted
            }else{
                if(nums[mid]<=target && target<=nums[end]){
                    strt=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}