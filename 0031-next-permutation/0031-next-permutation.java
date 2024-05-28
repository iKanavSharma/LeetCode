class Solution {
    private void reverse(int nums[],int strt){
        int i=strt;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    private void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int indx=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                indx=i;
                break;
            }
        }
        if(indx==-1){
            reverse(nums,0);//from starting point
            return;
        }
        for(int i=n-1;i>=0;i--){//swap til indx
            if(nums[i]>nums[indx]){
                swap(nums,i,indx);
                break;
            }
        }
        reverse(nums,indx+1);
    }
}