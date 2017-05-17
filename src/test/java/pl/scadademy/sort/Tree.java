package pl.scadademy.sort;

public class Tree {

	Node root;

	public void insert(int data) {
		Node input = insert(root, data);
		if(input.parent==null) root = input;
	}

	Node insert(Node node, int data) {
		if (node == null) {
			node = new Node(data);
		} else {
//			node.setParent(node);
			if (node.getRight() == null) {
				node.setRight(insert(node.getRight(), data));
			} else {
				node.setLeft(insert(node.getLeft(), data));
			}
		}
//		printNode(node);
		return node;
	}

	public void print() {
//		print(root);
		wypiszDane(root);
	}

	private void print(Node node) {
		if (node != null) {
			System.out.print(node.getValue() + " ");
			
			print(node.getLeft());
			print(node.getRight());
		}
	}
	
	
	void wypiszDane(Node node){

		if(node.getLeft()!=null) wypiszDane(node.getLeft());

		System.out.println(" " + node.getValue());

		if(node.getRight()!=null) wypiszDane(node.getRight());

		}
	
	private void printNode(Node node) {
		
		System.out.print(node.getValue() + " ");
		System.out.print(node.getParent() + " ");
		System.out.print(node.getLeft() + " ");
		System.out.print(node.getRight() + " ");
		System.out.println();
			
			
		
	}

}