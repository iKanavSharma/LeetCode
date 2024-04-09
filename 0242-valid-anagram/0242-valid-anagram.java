class Solution {
    public boolean isAnagram(String s, String t) {
        char []schar=s.toCharArray();
        char []tchar=t.toCharArray();
        if(s.length()!=t.length()){
            return false;
        }
        Arrays.sort(schar);
        Arrays.sort(tchar);
        return Arrays.equals(schar,tchar);
    }
}