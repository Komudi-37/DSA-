import java.util.*;

class BSTIterator {

    Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) {
        pushLeft(root);
    }

    private void pushLeft(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    public int next() {
        TreeNode node = stack.pop();

        // After visiting the node,
        // process its right subtree
        pushLeft(node.right);

        return node.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}