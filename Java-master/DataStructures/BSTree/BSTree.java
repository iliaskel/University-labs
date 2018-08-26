public class BSTree {
   
    private TreeNode root;
   
    public BSTree(){
        root = null;
    }
   
    public boolean isEmpty(){
        return root == null;
    }
   
    public void insertElement(Object data){
        if (isEmpty())
            root = new TreeNode(data);
        else
            insertNode(data, root);
    }
   
    private void insertNode(Object data, TreeNode root){
        if (((Comparable)(data)).compareTo((Comparable)root.getNodeData()) < 0){
            if (root.getLeftNode() == null)
                root.setLeftNode(new TreeNode(data));
            else
                insertNode(data, root.getLeftNode());
        }
        else
            if (root.getRightNode() == null)
                root.setRightNode(new TreeNode(data));
            else
                insertNode(data, root.getRightNode());
    }  
   
    public void inOrderTraversal(){
        System.out.println("IN ORDER TRAVERSAL.");
        inOrder(root);
        System.out.println();
    }
   
    public void preOrderTraversal(){
        System.out.println("PRE ORDER TRAVERSAL.");
        preOrder(root);
        System.out.println();
    }
   
    public void postOrderTraversal(){
        System.out.println("POST ORDER TRAVERSAL.");
        postOrder(root);
        System.out.println();
    }
   
       
    private void inOrder(TreeNode node){
        if (node == null)
            return;
        inOrder(node.getLeftNode());
        System.out.print(node.getNodeData() + " ");
        inOrder(node.getRightNode());
    }
   
    private void preOrder(TreeNode node){
        if (node == null)
            return;
        System.out.print(node.getNodeData() + " ");
        preOrder(node.getLeftNode());
        preOrder(node.getRightNode());
    }
   
    private void postOrder(TreeNode node){
        if (node == null)
            return;
        postOrder(node.getLeftNode());
        postOrder(node.getRightNode());
        System.out.print(node.getNodeData() + " ");
    }
   
    public void treeSort(Object[] array){
        for (int i = 0; i < array.length; i++)
            insertElement(array[i]);
        treeSort(root, array, 0);
    }
   
    private int treeSort(TreeNode node, Object[] array, int position){
        if (node.getLeftNode() != null)
            position = treeSort(node.getLeftNode(), array, position);
        array[position++] = node.getNodeData();
        if (node.getRightNode() != null)
            position = treeSort(node.getRightNode(), array, position);
        return position;
    }
   
    public int numberOfNodes(){
        return numberOfNodes(root);
    }
   
    private int numberOfNodes(TreeNode node){
        if (node == null)
            return 0;
        return 1 + (numberOfNodes(node.getLeftNode()) + numberOfNodes(node.getRightNode()));
    }
   
    public int treeHeight(){
        return treeHeight(root);
    }
   
    private int treeHeight(TreeNode node){
        if (node == null)
            return 0;
        return 1 + Math.max(treeHeight(node.getLeftNode()), treeHeight(node.getRightNode()));
    }
   
    public int treeHeight(Object data){
        if (root == null)
            return -1;
        return treeHeight(data, root);
    }
   
    private int treeHeight(Object data, TreeNode node){
        if (node == null)
            return -1;
        if (((Comparable)(data)).compareTo((Comparable)node.getNodeData()) < 0)
            return treeHeight(data, node.getLeftNode());
        if (((Comparable)(data)).compareTo((Comparable)node.getNodeData()) > 0)
            return treeHeight(data, node.getRightNode());
       
        return treeHeight(node);
    }
}