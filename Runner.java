public class Runner
{
	public Runner()
	{
		BinarySearchTree tree = new BinarySearchTree();
		BinarySearchTree preOrderTree = new BinarySearchTree();
		BinarySearchTree postOrderTree = new BinarySearchTree();
		BinarySearchTree inOrderTree = new BinarySearchTree();

		for (int i=0;i<30;i++){
			int num = (int)(Math.random()*100)+1;
			BinarySearchTree.TreeNode node = tree.new TreeNode(num);
			tree.add(num);
		}

		System.out.println("Size = "+tree.size());

		System.out.println();

		System.out.println("Original");
		System.out.print("\t" + "PreOrder: ");
		tree.preOrder(tree.getRoot());
		System.out.println();
		System.out.print("\t" + "InOrder: ");
		tree.inOrder(tree.getRoot());
		System.out.println();
		System.out.print("\t" + "PostOrder: ");
		tree.postOrder(tree.getRoot());

		System.out.println();
		System.out.println();

		preOrderTree = tree.preOrder(tree.getRoot(),tree);

		System.out.println("After PreOrder");
		System.out.print("\t" + "PreOrder: ");
		preOrderTree.preOrder(preOrderTree.getRoot());
		System.out.println();
		System.out.print("\t" + "InOrder: ");
		preOrderTree.inOrder(preOrderTree.getRoot());
		System.out.println();
		System.out.print("\t" + "PostOrder: ");
		preOrderTree.postOrder(preOrderTree.getRoot());

		System.out.println();
		System.out.println();

		inOrderTree = tree.inOrder(tree.getRoot(),inOrderTree);

		System.out.println("After InOrder");
		System.out.print("\t" + "PreOrder: ");
		inOrderTree.preOrder(inOrderTree.getRoot());
		System.out.println();
		System.out.print("\t" + "InOrder: ");
		inOrderTree.inOrder(inOrderTree.getRoot());
		System.out.println();
		System.out.print("\t" + "PostOrder: ");
		inOrderTree.postOrder(inOrderTree.getRoot());

		System.out.println("\n");
		System.out.println("Comment: The postorder traversal is the reverse of the inorder in the original, \n \t the inorder stays the same, and the preorder is the same as the original inorder.");
		System.out.println();

		postOrderTree = tree.postOrder(tree.getRoot(),postOrderTree);

		System.out.println("After PostOrder");
		System.out.print("\t" + "PreOrder: ");
		postOrderTree.preOrder(postOrderTree.getRoot());
		System.out.println();
		System.out.print("\t" + "InOrder: ");
		postOrderTree.inOrder(postOrderTree.getRoot());
		System.out.println();
		System.out.print("\t" + "PostOrder: ");
		postOrderTree.postOrder(postOrderTree.getRoot());

		System.out.println("\n");
		System.out.println("Comment: The inorder traversal stays the same and the preorder is the same as the original postorder. "+"\n");

	}
	public static void main(String[] args)
	{
		Runner app=new Runner();
	}

}