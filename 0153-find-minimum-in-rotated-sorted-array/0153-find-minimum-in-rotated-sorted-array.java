class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(nums[i]);
        }
        return pq.peek();
    }
}