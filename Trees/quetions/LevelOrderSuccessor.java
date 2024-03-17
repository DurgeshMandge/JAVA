package quetions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderSuccessor {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { 
            this.val = val; 
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


     public int findLevelSuccessor(TreeNode root, int target) {
        Queue<TreeNode> que = new LinkedList<>();
        int ans=-1;
        if(root==null){return ans;}
        que.offer(root);
        while(!que.isEmpty()){
            TreeNode node = que.poll();
            if(node.left!=null)
                que.offer(node.left);
            if(node.right!=null)
                que.offer(node.right);
            if(node.val==target){
                ans = que.poll().val;
                break;
            }   
        }
        return ans;
    }

    public static void main(String[] args) {
        // TreeNode root = new TreeNode(3,, new TreeNode(8));

    }
    
}