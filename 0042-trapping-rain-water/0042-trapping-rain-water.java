class Solution {
    public int trap(int[] height) {
        int n=height.length;
        //creating auxiliary array
        //left
        int left[]=new int[n];
        left[0]=height[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        //right
        int right[]=new int[n];
        right[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        //calcultaing trapped water
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int watertrapped=Math.min(left[i],right[i]);
            //final trapped water
            trappedwater+=watertrapped-height[i];
        }
        return trappedwater;
    }
}