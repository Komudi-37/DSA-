class Solution {

    private static int levels(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }

    private void nThlevel(TreeNode root, int level, int lvl, List<Integer> arr){
        if(root == null) return;

        if(level == lvl) {
            arr.add(root.val);
            return; // optional optimization
        }

        nThlevel(root.left, level + 1, lvl, arr);
        nThlevel(root.right, level + 1, lvl, arr);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        int lvl = levels(root);

        for(int i = 0; i < lvl; i++){   // cleaner loop
            List<Integer> arr = new ArrayList<>();
            nThlevel(root, 0, i, arr);
            ans.add(arr);
        }

        return ans;
    }
}