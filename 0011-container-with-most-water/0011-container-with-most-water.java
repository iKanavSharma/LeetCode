class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int leftPoin=0;
        int rightPoin=n-1;//last element
        int maxArea=Integer.MIN_VALUE;
        while(leftPoin<rightPoin){
            int width=rightPoin-leftPoin;
            int length=Math.min(height[leftPoin],height[rightPoin]);
            int area=length*width;
            maxArea=Math.max(maxArea,area);
            if(height[leftPoin]<height[rightPoin]){
                leftPoin++;
            }else if(height[leftPoin]==height[rightPoin]){
                rightPoin--;
            }else{
                rightPoin--;
            }
        }
        return maxArea;
    }
}