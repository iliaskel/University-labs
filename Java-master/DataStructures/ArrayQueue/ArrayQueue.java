package erg03;


public class ArrayQueue implements Queue {
    private int megethos;
    private Object[] pinakas;
    private int first;
    private int last;
    
    ArrayQueue(){}
    ArrayQueue(int megethos){
        this.megethos=megethos;
        pinakas = new Object[megethos];
    }
    
    public int size(){
        return (last-first);
    }
    
    public boolean isEmpty(){
        return (first==last);
    }
    
    public Object front( ) throws QueueEmptyException{
        if (isEmpty( ))
            throw new QueueEmptyException("Queue is empty");
        return pinakas[first];
    }
    
    public void enqueue(Object item) throws QueueFullException{
        if(last==megethos)
            throw new QueueFullException("Queue overflow");
        pinakas[last++] = item;
    }
    
    public Object dequeue( ) throws QueueEmptyException{
        Object item;
        if(isEmpty())
            throw new QueueEmptyException("Queue is empty");
        item = pinakas[first];
        pinakas[first++] = null; 
        return item;
    }
    
    public boolean isFull(){
        return (last==megethos);
    }
    
    public void setFirst(int first){
        this.first=first;
    }
    
    public void setLast(int last){
        this.last=last;
    }
    
    
}
