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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);//elemnt with index number
        }
        TreeNode root=tree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
        return root;
    }
    public TreeNode tree(int []preorder,int preStart,int preEnd,int []inorder,int inStart,int inEnd,HashMap<Integer,Integer> map){
        if(preStart>preEnd || inStart>inEnd)
            return null;
        TreeNode root=new TreeNode(preorder[preStart]);
        int inRoot=map.get(root.val);
        int numLeft=inRoot-inStart;
        root.left=tree(preorder,preStart+1,preStart+numLeft,inorder,inStart,inRoot-1,map);
        root.right=tree(preorder,preStart+numLeft+1,preEnd,inorder,inRoot+1,inEnd,map);
        return root;
    }
}