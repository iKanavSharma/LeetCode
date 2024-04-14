class Solution {
    public String frequency(String str){
        //create an array of freq 
        int freq[]=new int[26];
        //conver to chararray
        char[] chars=str.toCharArray();
        for(int i=0;i<chars.length;i++){
            char c= chars[i];
            freq[c-'a']++;
        }
        StringBuilder freqStore=new StringBuilder("");
        char c='a';
        for(int i= 0;i<freq.length;i++){
            freqStore.append(c);
            freqStore.append(freq[i]);
            c++;
        }
        return freqStore.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        //edge case
        if(strs==null||strs.length==0){
            return new ArrayList<>();
        }
        HashMap<String,List<String>> freqMap=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            //want each string of array
            String str=strs[i];
            String freqString=frequency(str);
            //if key is present
            if(freqMap.containsKey(freqString)){
                freqMap.get(freqString).add(str);
            }else{
                ArrayList<String> strlist=new ArrayList<>();
                strlist.add(str);
                freqMap.put(freqString,strlist);
            }
        }
        return new ArrayList<>(freqMap.values());
    }
}