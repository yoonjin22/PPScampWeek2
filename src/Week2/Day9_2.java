package Week2;
//��Ʈ�� ���� ����� �ִ���̿� ���� ����� �ִ���� ���ϱ�



public class Day9_2 {
	

	  public class TreeNode { //Ʈ����� ����
	      int val;
	      TreeNode left;
	      TreeNode right;
	      
	      TreeNode() {}
	      TreeNode(int val){
	    	  this.val = val; 
	      }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	 }
	 
	class Solution {
	  int depthMax = 0; //������ �ִ밪 0
	  public int diameterOfBinaryTree(TreeNode root) {
		  int depth = 0;
		  int maxDepth =0;
		  int maxDepth2 = 0;
		  
		  if(root != null) {
			  if(root.left!=null) {
				maxDepth = exploreTree(root.left,1);
				
			  }
			  if(root.right!=null) {
				  maxDepth2 = exploreTree(root.right,1);
			  }
			  System.out.println(maxDepth);
			  System.out.println(maxDepth2);
			  
			  }
		  return maxDepth + maxDepth2;
	        
	    }
	  
	  private int exploreTree(TreeNode treeNode, int depth) {
		  int maxDepth = depth;
		  
		  if(treeNode!=null && treeNode.left!=null) {
			  int returnDepth = exploreTree(treeNode.left, depth+1);
			  maxDepth = Math.max(maxDepth, returnDepth);
			  System.out.println("MaxDepth : "+maxDepth);
		  }
		  
		  if(treeNode != null && treeNode.right !=null){
			  int returnDepth = exploreTree(treeNode.right, depth+1);
			  maxDepth = Math.max(maxDepth, returnDepth);
			  System.out.println("MaxDepth : "+maxDepth);  
		  }
		  
		  return maxDepth;
	  }
	}
}
