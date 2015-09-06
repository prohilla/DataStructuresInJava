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
			System.out.println("Node wiht key "+nodeToBeInserterd.key+" inserted as root");
		}
		else{
			Node current=root;
			Node parent;
			while(true){
				parent=current;
				if(nodeToBeInserterd.key<current.key){
					current =current.leftChild;
					if(current==null){
					parent.leftChild=nodeToBeInserterd;
					System.out.println("Node with key "+nodeToBeInserterd.key+" inserted as left child to parent "+parent.key);
					return;
					}
				}
				else{
					current=current.rightChild;
					if(current==null){
						parent.rightChild=nodeToBeInserterd;
						System.out.println("Node with key "+nodeToBeInserterd.key+" inserted as right child to parent "+parent.key);
						return;
					}
				}
			}
		}
		
	}
	
	public void delete(int key){
		
	}
}
