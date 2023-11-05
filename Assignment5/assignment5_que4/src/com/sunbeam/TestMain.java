package com.sunbeam;

public class TestMain 
{

	public static void main(String[] args) 
	{
		BST tree = new BST();
		int valuesToAdd[] = {50, 30, 70, 20, 40,35, 60, 80};

		for (int value : valuesToAdd) {
			tree.recAddNode(value);
		}
		
		tree.BFSTraversal();
		tree.DFStraversal();
		
        if(tree.BSTSearch(30)) 
        	System.out.println("\nKey found in the tree");
        else 
        	System.out.println("Key is not found");
			tree.preOrder();


        BST.Node parentChild[]=tree.BSTSearchWithParent(40);
        System.out.println("Child node data : "+parentChild[0].getData());
        System.out.println("Parent node data : "+parentChild[1].getData());

        tree.deleteNode(60);
		tree.preOrder();
		
		System.out.println(tree.height());
	}

}
