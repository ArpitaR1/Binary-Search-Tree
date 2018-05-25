public class BinarySearchTree{

	TreeNode root = null;
	int size=0;

	public TreeNode getRoot(){
		return root;
	}

	public void add(int num){

		if (root==null){
			root = new TreeNode(num);
			size++;
		}
		else{
			add(num,root);
		}

	}

	public int size(){
		return size;
	}

	public void add(int num, TreeNode node){
		if (!contains(new TreeNode(num))){
			if (num < node.getValue()) {
				if (node.getLeft() == null) {
					node.setLeft(new TreeNode(num));
					size++;
				}
				else{
					add(num,node.getLeft());

				}
			}
			else if (num > node.getValue()) {
				if (node.getRight() == null) {
					node.setRight(new TreeNode(num));
					size++;
				}
				else{
					add(num,node.getRight());

				}
			}
		}
	}

	public void preOrder(TreeNode value){
		System.out.print(value.getValue()+" ");
		if (value.getLeft()!=null){
			preOrder(value.getLeft());
		}
		if (value.getRight()!=null){
			preOrder(value.getRight());
		}
	}

	public BinarySearchTree preOrder(TreeNode value,BinarySearchTree tree){
		//System.out.print(value.getValue()+" ");
		//return value.getValue()+"";
		tree.add(value.getValue());
		if (value.getLeft()!=null){
			preOrder(value.getLeft(),tree);
		}
		if (value.getRight()!=null){
			preOrder(value.getRight(),tree);
		}
		return tree;
	}

	public void postOrder(TreeNode value){
		if (value.getLeft()!=null){
			postOrder(value.getLeft());
		}
		if (value.getRight()!=null){
			postOrder(value.getRight());
		}
		System.out.print(value.getValue()+" ");
	}

	public BinarySearchTree postOrder(TreeNode value,BinarySearchTree tree){
		if (value.getLeft()!=null){
			postOrder(value.getLeft(),tree);
		}
		if (value.getRight()!=null){
			postOrder(value.getRight(),tree);
		}
		//System.out.print(value.getValue()+" ");
		tree.add(value.getValue());
		return tree;
	}

	public void inOrder(TreeNode value){
		if (value.getLeft()!=null){
			inOrder(value.getLeft());
		}
		System.out.print(value.getValue()+" ");
		if (value.getRight()!=null){
			inOrder(value.getRight());
		}
	}

	public BinarySearchTree inOrder(TreeNode value,BinarySearchTree tree){
		if (value.getLeft()!=null){
			inOrder(value.getLeft(),tree);
		}
		//System.out.print(value.getValue()+" ");
		tree.add(value.getValue());
		if (value.getRight()!=null){
			inOrder(value.getRight(),tree);
		}
		return tree;
	}

	public boolean contains(TreeNode value){
		//System.out.print(value.getValue()+" ");
		if (value==root || value==value.getLeft() || value==value.getRight()){
			return false;
		}
		if (value.getLeft()!=null){
			preOrder(value.getLeft());
		}
		if (value.getRight()!=null){
			preOrder(value.getRight());
		}
		return false;
	}

	public class TreeNode{

		int value;
		TreeNode right, left;

		public TreeNode(int num){
			value = num;
			right = null;
			left = null;
		}

		public void TreeNode(int num, TreeNode r, TreeNode l){
			value = num;
			right = r;
			left = l;
		}

		public int getValue(){
			return value;
		}

		public TreeNode getRight(){
			return right;
		}

		public TreeNode getLeft(){
			return left;
		}

		public void setRight(TreeNode r){
			right = r;
		}

		public void setLeft(TreeNode l){
			left = l;
		}

		public String toString(){
			return value+"";
		}

	}

}