public class TreeNode {
   private TreeNode left;
   private Object item;
   private TreeNode right;
   
   TreeNode(Object item){
       this.item = item;
       left = right = null;
   }
   
   public Object getNodeData(){
       return this.item;
   }
   
   public void setNodeData(int item){
       this.item=item;
   }
   
   public TreeNode getLeftNode(){
       return left;
   }
   public TreeNode getRightNode(){
       return right;
   }
   public boolean isLeaf(){
       return(left==null && right==null);
   }
   public void setLeftNode(TreeNode node){
       this.left = node;
   }
   public void setRightNode(TreeNode node){
       this.right = node;
   }
   
   public void insert(int data){
       if (((Comparable)(data)).compareTo((Comparable)item) < 0){
           if (left == null)
           left = new TreeNode(data);
        else
            left.insert(data);
        }
       else if(right == null)
            right = new TreeNode(data);
        else
            right.insert(data);
   }
   
   public void inOrder(TreeNode node){
       if (node == null)
            return;
       inOrder(node.left);
       System.out.print(node.item + " ");
       inOrder(node.right);
   }
   
   public void preOrder(TreeNode node){
       if (node == null)
            return;
       System.out.print(node.item + " ");
       preOrder(node.left);
       preOrder(node.right);
   }
   
   public void postOrder(TreeNode node){
       if (node == null)
           return;
       postOrder(node.left);
       postOrder(node.right);
       System.out.print(node.item + " ");
   }
   
}
