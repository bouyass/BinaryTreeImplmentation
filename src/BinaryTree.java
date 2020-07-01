
public class BinaryTree {
	
	Node root;
	
	private Node addRecursive(Node current, int value) {
		
		if(current == null) {
			return new Node(value);
		}
		
		if(value < current.value) {
			current.left = addRecursive(current.left,value);
		}else if(value > current.value)
		{
			current.right = addRecursive(current.right,value);
		}else {
			return current;
		}
		return current;
	}
	
	
	public void add(int value) {
		root = addRecursive(root,value);
	}
	
	
	public static BinaryTree createBinaryTree() {
		BinaryTree bt = new BinaryTree();
		
		bt.add(6);
		bt.add(2);
		bt.add(4);
		bt.add(9);
		bt.add(14);
		bt.add(1);
		
		return bt;
	}
	
	public boolean findNodeRecursive(Node node, int value) {
		
		boolean found = false;
		
		if (node.value == value) {
			return true;
		}else if(node.value > value) {
			found = findNodeRecursive(node.left,value);
		}else if(node.value < value) {
			found = findNodeRecursive(node.right,value);
		}
		return found;
	}

}
