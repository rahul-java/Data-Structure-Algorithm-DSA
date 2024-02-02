package Tree.Question.MinValueAndMaxValueOfTree;

public class MinValueAndMaxValueOfTree {

	static Node root = null;

	static class Node {

		Object data;
		Node left;
		Node right;

		Node(Object data) {
			this.data = data;
		}

	}

	public void add(Object data) {
		Node node = new Node(data);

		// System.out.println("Added node : "+node.data);

		if (root == null) {
			root = node;
		} else {
			Node tempNode = root;

			while (true) {
				int rootValue = (Integer) tempNode.data;
				int givenNodeValue = (Integer) data;

				if (givenNodeValue < rootValue) {
					if (tempNode.left == null) {
						tempNode.left = node;
						return;
					} else {
						tempNode = tempNode.left;
					}
				} else {
					if (tempNode.right == null) {
						tempNode.right = node;
						return;
					} else {
						tempNode = tempNode.right;
					}
				}
			}
		}

		System.out.println("root : " + root.data);

	}

	public static void main(String[] args) {

		MinValueAndMaxValueOfTree binarySearchTree = new MinValueAndMaxValueOfTree();

		binarySearchTree.add(15);
		binarySearchTree.add(11);
		binarySearchTree.add(17);
		binarySearchTree.add(9);
		binarySearchTree.add(16);
		binarySearchTree.add(21);
		binarySearchTree.add(7);
		binarySearchTree.add(10);
		binarySearchTree.add(20);
		binarySearchTree.add(31);

		System.out.println("Added Successfully");

		System.out.println("============Searching Man And Max Value=================");

		Object minValue = minValue(root);
		Object maxValue = maxValue(root);
		
		System.out.println("Min Value :"+minValue+" , Max Value : "+maxValue); //Min Value :7 , Max Value : 31
	}

	private static Object maxValue(Node root) {

		Object data = null;

		while (root != null) {
			data = root.data;
			root = root.right;
		}

		return data;
	}

	private static Object minValue(Node root) {

		Object data = null;

		while (root != null) {
			data = root.data;
			root = root.left;
		}

		return data;
	}

}
