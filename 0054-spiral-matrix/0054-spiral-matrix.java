class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int sr=0;
        int sc=0;
        int er=m-1;
        int ec=n-1;
        ArrayList<Integer> ans=new ArrayList<>();
        while(sr<=er && sc<=ec){
            //right ->
            for(int i=sc;i<=ec;i++){
                ans.add(matrix[sr][i]);
            }
            sr++;
            //bottom ↓
            for(int i=sr;i<=er;i++){
                ans.add(matrix[i][ec]);
            }
            ec--;
            //left <-
            //back traversal
            if(sr<=er){
                for(int i=ec;i>=sc;i--){
                    ans.add(matrix[er][i]);
                }
                er--;
            }
            //top ↑
            //back traversal
            if(sc<=ec){
                for(int i=er;i>=sr;i--){
                    ans.add(matrix[i][sc]);
                }
                sc++;
            }
        }
        return ans;
    }
}