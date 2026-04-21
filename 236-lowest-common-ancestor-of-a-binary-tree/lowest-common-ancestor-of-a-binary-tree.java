class Solution {

    public boolean exists(TreeNode root, TreeNode node){
        if(root == null) return false;
        if(root == node) return true;
        return exists(root.left,node) || exists(root.right,node);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null) return null;   // IMPORTANT
        
        if(p == root || q == root) return root;

        // check in left subtree
        boolean pLiesInLST = exists(root.left, p);
        boolean qLiesInLST = exists(root.left, q);

        // both in left subtree
        if(pLiesInLST && qLiesInLST){
            return lowestCommonAncestor(root.left, p, q);
        }

        // both in right subtree
        if(!pLiesInLST && !qLiesInLST){
            return lowestCommonAncestor(root.right, p, q);
        }

        // one in left, one in right
        return root;
    }
}