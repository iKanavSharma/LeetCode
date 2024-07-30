/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public String getString(TreeNode root,List<TreeNode> ans,HashMap<String,Integer> map){
        if(root==null)
            return "N";
        String s=root.val+","+getString(root.left,ans,map)+","+getString(root.right,ans,map);
        if(map.containsKey(s)){
            map.put(s,map.get(s)+1);
        }
        else{
            map.put(s,1);
        }
        if(map.get(s)==2){
            ans.add(root);
        }
        return s;
    }
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ans=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        getString(root,ans,map);
        return ans;
    }
}