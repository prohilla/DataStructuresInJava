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
		
	}
	
	public void delete(int key){
		
	}
}
