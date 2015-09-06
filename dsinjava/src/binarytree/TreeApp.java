package binarytree;

public class TreeApp {
	
	public static void main(String[] args){
		
		Tree myTree=new Tree();
		
		myTree.insert(34, 50);
		myTree.insert(23, 50);
		myTree.insert(74, 50);
		myTree.insert(45, 50);
		myTree.insert(62, 50);
		
		Node nodeFound=myTree.find(74);
		if(nodeFound!=null){
		System.out.println("Node found with key "+nodeFound.key+" and data "+nodeFound.data );
		}
		else{
			System.out.println("Node with specified key not found");
		}
		myTree.delete(45);
	}
}
