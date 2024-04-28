class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0){
            return 0;
        }
        int island=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    island++;
                    bfs(grid,i,j);
                }
            }
        }
        return island;
    }
    public void bfs(char grid[][],int row,int col){
        int m=grid.length;
        int n=grid[0].length;
        int directions[][]={{1,0},{-1,0},{0,1},{0,-1}};
        Queue<int []>q=new ArrayDeque<>();
        q.offer(new int[]{row,col});
        while(!q.isEmpty()){
            int [] curr=q.poll();
            int x=curr[0];
            int y=curr[1];
            if(x<0 || x>=m || y<0 || y>=n || grid[x][y]!='1'){
               continue;
            }
            grid[x][y]='0';//marked as visited 
            for(int dir[]:directions){
                int nx=x+dir[0];//directions is stored in dir
                int ny=y+dir[1];
                if(nx>=0 && nx<m && ny>=0 && ny<n && grid[nx][ny]=='1'){
                    q.offer(new int[]{nx,ny});
                }
            }
        }
    }
}