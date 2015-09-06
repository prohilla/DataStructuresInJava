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
			System.out.println("Search Results:");
			System.out.println("Node found with key "+nodeFound.key+" and data "+nodeFound.data );
			System.out.println();
		}
		else{
			System.out.println("Search Results:");
			System.out.println("Node with specified key not found");
		}
		
		System.out.println("Start of Pre-Order traversal");
		myTree.preOrderTraversal(myTree.root);
		
		System.out.println("Start of In-Order traversal");
		myTree.inOrderTraversal(myTree.root);
		
		System.out.println("Start of Post-Order traversal");
		myTree.postOrderTraversal(myTree.root);
		myTree.delete(45);
	}
}
