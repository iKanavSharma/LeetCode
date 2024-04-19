class Solution {
    public String longestPalindrome(String s) {
        int start=0;
        int end=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            //centre is not same
            int len1=expandFromCentre(s,i,i+1);
            //centre is same
            int len2=expandFromCentre(s,i,i);
            //max of both
            int len=Math.max(len1,len2);
            if(end-start<len){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);//as last indx not included so +1;
    }
    public int expandFromCentre(String s,int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;
    }
}