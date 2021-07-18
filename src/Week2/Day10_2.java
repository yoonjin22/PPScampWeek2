package Week2;

import java.util.ArrayList;
import java.util.Collections;

import Week2.Day9_2.TreeNode;

public class Day10_2 {
	public TreeNode increasingBST(TreeNode root) {
        // corner cases
        if (root == null) {
            return null;
        }
        
        return inorder(root, null);
    }
    
    private TreeNode inorder(TreeNode root, TreeNode tail) {
        // corner cases 
        if (root == null) {
            return tail;
        }
        
        TreeNode head = inorder(root.left, root);
        root.left = null;
        root.right = inorder(root.right, tail);
        return head;
    }
}