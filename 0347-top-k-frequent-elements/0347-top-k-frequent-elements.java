class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Step 1->store elements with frequency
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        //step 2-> max priority queue storing elements on the basis of value(frequency)
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            pq.add(entry);
            //making pq to store on k frequent elements
            if(pq.size()>k){
                pq.poll();
            }
        }
        //Creating array to store elemnets and return that array
        int i=0;
        int res[]=new int[k];
        while(!pq.isEmpty()){
            res[i]=pq.poll().getKey();
            i++;
        }
        return res;
    }
}