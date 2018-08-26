public class SimpleLinkedList implements List {
    private SLListNode first;
    private SLListNode last;
    int metritis = 0;
    
    SimpleLinkedList(){
        first = last = null;
    }
   /* SimpleLinkedList(SLListNode first, SLListNode last){
        this.first=first;
        this.last=last;
    }*/
    
    public boolean isEmpty(){
        return (first==null);
    }
    
    public int size(){
        return metritis;
    }
    
    public void insertFirst(Object data){
        SLListNode B = new SLListNode(data, null);
        B.setNextNode(first);
        first=B;
        if(isEmpty()){
            last=first;
        }
        metritis++;
    } 
    
    public void insertLast(Object data){
       /* SLListNode B = new SLListNode(data, null);
        last.setNextNode(B);
        last=B;
        if(isEmpty()){
            first=last;
        }
        metritis++;*/
        if (isEmpty( ))
            first = last = new SLListNode(data, null);
        else
            last = last = new SLListNode(data, null);
        metritis++;
    }

    
    public Object removeFirst() throws ListEmptyException{
        Object removeItem;
        if(isEmpty())
            throw new ListEmptyException("Empty List");
        removeItem = first.getNodeData();
        if(first==last)
            first=last=null;
        else
            first=first.getNextNode();
        return removeItem;
    }
    
    public Object removeLast() throws ListEmptyException{
       /* SLListNode tmp = first;
        SLListNode tmp1;
       
        while(tmp.getNextNode()!=last && tmp.getNextNode()!=null )
            tmp=tmp.getNextNode();
        
        metritis--;
        tmp1=last;
        tmp.setNextNode(null);
        last=tmp;
        return tmp1.getNodeData();*/
                                                        Object removeItem;
                                                        if (isEmpty( ))
                                                            throw new ListEmptyException("Empty List!!!");
                                                        removeItem = last.getNodeData();
                                                        if (first == last)
                                                            first = last = null;
                                                        else{ 
                                                            SLListNode current = first;
                                                            while (current.getNextNode() != last)
                                                            current = current.getNextNode();
                                                            last = current;
                                                            current.setNextNode(null);
                                                        }
                                                        return removeItem;
    }
    
    public void printList(){
        if(isEmpty())
            System.out.println("Empty List");
        else{
            SLListNode current = first;
            while (current!=null){
                System.out.println(current.getNodeData().toString()+" ");
                current = current.getNextNode();
            }
            System.out.println("\n");
        }
    }
    
}
