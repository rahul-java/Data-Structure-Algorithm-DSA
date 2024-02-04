package Tree.Question.DepthOfTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int value) {
        this.value = value;
        this.left = this.right = null;
    }
}

public class DepthOfTree {
	
	//static List<String> list=new ArrayList<>();

    // Breadth-First Search (BFS) Traversal
    static void bfsTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.value + "->");
            //list.add(current.value + "->");

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
       // return list;
    }

    // Depth-First Search (DFS) Traversal
    static void dfsTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            System.out.print(current.value + "->");

            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }

    public static void main(String[] args) {
        // Constructing a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("==============Binary Tree Path=============");
        System.out.print("BFS Traversal: ");
        bfsTraversal(root);

        System.out.println(); // newline

        System.out.print("DFS Traversal: ");
        dfsTraversal(root);
    }
}
