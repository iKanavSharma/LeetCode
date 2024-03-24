class Solution {
    void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void reverse(int nums[],int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int indx1=-1;//index for break point
        int indx2=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){//backward travesral for finding breaking point
            if(nums[i]<nums[i+1]){
                indx1=i;
                break;
            }
        }
        if(indx1==-1){
            reverse(nums,0);//last permutation so next will be first array
        }else{
            for(int i=n-1;i>=0;i--){
                if(nums[i]>nums[indx1]){
                    indx2=i;
                    break;
                }
            }
            swap(nums,indx1,indx2);
            reverse(nums,indx1+1);
        }
    }
}
       