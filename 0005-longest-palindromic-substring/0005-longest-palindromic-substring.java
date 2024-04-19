class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(s==null || s.length()<2){
            return s;
        }
        int maxLen=0;
        String longestPalindromic="";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String substrings=s.substring(i,j);
                if(isPalindrome(substrings)&& substrings.length()>maxLen){
                    maxLen=substrings.length();
                    longestPalindromic=substrings;
                }
            }
        }
        return longestPalindromic;
    }
    public boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}