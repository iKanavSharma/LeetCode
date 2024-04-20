class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            int even=palindromiccount(s,i,i+1);
            int odd=palindromiccount(s,i-1,i+1);
            ans+=even+odd+1;
        }
        return ans;
    }
    public int palindromiccount(String s,int i,int j){
        int count=0;
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
           count++;
            i--;
            j++;
        }
        return count;
    }
}