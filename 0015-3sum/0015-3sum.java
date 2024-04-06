class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        HashSet<ArrayList<Integer>> set=new HashSet<>();
        for(int i=0;i<n;i++){
           HashSet<Integer> hset=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third=-(nums[i]+nums[j]);
                if(hset.contains(third)){
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);
                    Collections.sort(temp);
                    set.add(temp);
                }
                hset.add(nums[j]);
             }
        }
        ArrayList<List<Integer>> ans=new ArrayList<>();
        ans.addAll(set);
        return ans;
    }
}