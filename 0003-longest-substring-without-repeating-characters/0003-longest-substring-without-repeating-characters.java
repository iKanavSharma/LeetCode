class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxLen=0;
        for(int i=0;i<n;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=i;j<n;j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                int len=j-i+1;
                maxLen=Math.max(len,maxLen);
                set.add(s.charAt(j));
            }
        }
        return maxLen;
    }
}