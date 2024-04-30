class Solution {
    public int largestArea(int matrix[]){
        int n=matrix.length;
        int maxArea=0;
        int nsl[]=new int[n];
        int nsr[]=new int[n];
        //nsr
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && matrix[s.peek()]>=matrix[i]){
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
        s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && matrix[s.peek()]>=matrix[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //calculation
        for(int i=0;i<n;i++){
            int height=matrix[i];
            int width=nsr[i]-nsl[i]-1;
            int area=height*width;
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        if(n==0){
            return 0;
        }
        int height[]=new int[m];
        int maxArea=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1'){
                    height[j]++;
                }else{
                    height[j]=0;
                }
            }
            int area=largestArea(height);
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
}