class Solution {
    public String minWindow(String s, String t) {
        int hash[]=new int[256];
        int l=0;
        int r=0;
        int m=s.length();
        int n=t.length();
        int minLen=Integer.MAX_VALUE;
        int count=0;
        int strtIdx=-1;
        //pre insert string t in hash array
        for(int i=0;i<n;i++){
            hash[t.charAt(i)]++;
        }
        //traversing till s.length()
        while(r<m){
            if(hash[s.charAt(r)]>0){
                count++;
            }
            hash[s.charAt(r)]--;
            while(count==n){
                if(r-l+1<minLen){
                    minLen=r-l+1;
                    strtIdx=l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)]>0){
                    count--;
                }
                l++;
            }
            r++;
        }
        if(strtIdx==-1){
            return "";
        }
        
        return s.substring(strtIdx,strtIdx+minLen);
    }
}
