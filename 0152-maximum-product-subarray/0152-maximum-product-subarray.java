class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int preffix=1;
        int suffix=1;
        int maxProduct=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(preffix==0){
                preffix=1;
            }
            if(suffix==0){
                suffix=1;
            }
            preffix*=nums[i];
            suffix*=nums[n-i-1];
            maxProduct=Math.max(maxProduct,Math.max(preffix,suffix));
        }
        return maxProduct;
    }
}