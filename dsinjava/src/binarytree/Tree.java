package binarytree;

public class Tree {
	
	private Node root;
	
	public Node find(int key){
		Node currentNode=root;
		while(currentNode.key!=key){
			if(key<currentNode.key){
				currentNode=currentNode.leftChild;
			}
			else{
				currentNode=currentNode.rightChild;
			}
			if(currentNode==null){
				return null;
			}
		}
		return currentNode;
	}
	
	public void insert(int key, int data){
		
		Node nodeToBeInserterd= new Node();
		nodeToBeInserterd.key=key;
		nodeToBeInserterd.data=data;
		
		if(root==null){
			root=nodeToBeInserterd;
		}
		else{
			Node parent=root;
			while(true){
				if(nodeToBeInserterd.key<parent.key && parent.leftChild==null){
					parent.leftChild=nodeToBeInserterd;
					System.out.println("Node inserted");
					return;
				}
				else{
					parent=parent.leftChild;
				}
				
				if(nodeToBeInserterd.key>parent.key && parent.rightChild==null){
					parent.rightChild=nodeToBeInserterd;
					System.out.println("Node inserted");
					return;
				}
				else{
					parent=parent.rightChild;
				}
			}
		}
		
	}
	
	public void delete(int key){
		
	}
}
