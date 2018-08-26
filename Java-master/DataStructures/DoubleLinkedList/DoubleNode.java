
public class DoubleNode {
    private Object item;
    private DoubleNode next, previous;
    
    public DoubleNode(){
        this(null,null,null); 
    }
    
    public DoubleNode(Object item, DoubleNode next, DoubleNode previous) {
        this.item = item;
        this.next = next;
        this.previous = previous;
    }
    
    public Object getItem(){
        return(item);
    }
    
    public DoubleNode getNext( ) {
    return(next); }
    
    public DoubleNode getPrevious(){
        return(previous);
    }
    
    public void setItem(Object newItem){
        item = newItem;
    }
    
    public void setNext(DoubleNode newNext){
        next = newNext;
    }
    
    public void setPrevious(DoubleNode newPrevious){
        previous = newPrevious;
    } 
}
