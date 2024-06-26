class Solution {
    public boolean isMatch(String s, String p) {
        int n=s.length();
        int m=p.length();
        boolean dp[][]=new boolean[n+1][m+1];
        //intilize
        dp[0][0]=true;
        //pattern is empty
        for(int i=1;i<n+1;i++){
            dp[i][0]=false;
        }
        //s is empty
        for(int j=1;j<m+1;j++){
            if(p.charAt(j-1)=='*'){//last character
                dp[0][j]=dp[0][j-1];
            }
        }
        //bottom up manner
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){//last character
                    dp[i][j]=dp[i-1][j-1];
                }else if(p.charAt(j-1)=='*'){
                    dp[i][j]=dp[i][j-1] || dp[i-1][j];
                }else{
                    dp[i][j]=false;
                }
            }
        }
        //final answer
       return dp[n][m]; 
    }
}