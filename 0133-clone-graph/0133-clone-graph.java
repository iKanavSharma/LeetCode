/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        //Map to store clone level wise
        HashMap<Node,Node> map=new HashMap<>();
        //BFS
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        map.put(node,new Node(node.val));
        //perform bfs
        while(!q.isEmpty()){
            Node curr=q.poll();
            Node currNode=map.get(curr);
            for(Node it:curr.neighbors){
                if(!map.containsKey(it)){
                    map.put(it,new Node(it.val));
                    q.add(it);
                }
                currNode.neighbors.add(map.get(it));
            }
        }
        return map.get(node);
    }
}