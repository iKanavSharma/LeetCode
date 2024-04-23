class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int col=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                //row{0}=col[n];
                //col{0}=row[m];
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    //edge case of overlapping
                    if(j!=0){
                        matrix[0][j]=0;
                    }else{
                        col=0;
                    }
                }  
            }
        }
        //neglecting marked row and column 
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0]==0){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }
        if(col==0){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
    }
}