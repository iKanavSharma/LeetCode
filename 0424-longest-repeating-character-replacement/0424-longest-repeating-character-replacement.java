class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int maxLen=0;
        int left=0;
        int right=0;
        int maxfreq=0;
        int []map=new int[26];
        while(right<n){
            map[s.charAt(right)-'A']++;
            maxfreq=Math.max(maxfreq,map[s.charAt(right)-'A']);
            if((right-left+1)-maxfreq>k){
                map[s.charAt(left)-'A']--;
                left++;
            }
              maxLen=Math.max(maxLen,(right-left+1));
           
            right++;
        }
        return maxLen;
    }
}
    