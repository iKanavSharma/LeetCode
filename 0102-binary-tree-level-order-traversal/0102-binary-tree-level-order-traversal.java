/**
 * Definition for a binary tree node.
 * public class TreeTreeNode {
 *     int val;
 *     TreeTreeNode left;
 *     TreeTreeNode right;
 *     TreeTreeNode() {}
 *     TreeTreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
            return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelSize=q.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                TreeNode currNode=q.remove();
                temp.add(currNode.val);
                if(currNode.left!=null)
                    q.add(currNode.left);
                if(currNode.right!=null)
                    q.add(currNode.right);
            }
            ans.add(temp);
        }
        return ans;
    }
}