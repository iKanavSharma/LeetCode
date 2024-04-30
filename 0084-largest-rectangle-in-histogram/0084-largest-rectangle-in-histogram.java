class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int maxArea=0;
        int nsl[]=new int[n];
        int nsr[]=new int[n];
        //nsr
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){//last element is n-1
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=n;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //nsl
        //empty stack for storing nsl
        s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();//remove element
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //calculating
        for(int i=0;i<n;i++){
            int height=heights[i];
            int width=nsr[i]-nsl[i]-1;//-1 to have elements in between boundary
            int area=height*width;
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
}