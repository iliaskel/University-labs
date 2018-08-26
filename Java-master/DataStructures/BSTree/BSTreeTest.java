
public class BSTreeTest {
    public static void main(String[] args){
        int matrix[ ] = {40, 15, 25, 50, 20, 10, 70, 55, 45, 5 };
        BSTree tree = new BSTree();
        for (int i=0; i<matrix.length; i++)
            tree.insertElement(matrix[i]);
        
        
        int n = tree.numberOfNodes();
        System.out.println(n);
        
        int n2 = tree.treeHeight();
        System.out.println(n2);
    }
}
