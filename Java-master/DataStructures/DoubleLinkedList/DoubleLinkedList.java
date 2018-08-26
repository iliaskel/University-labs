public class DoubleLinkedList implements List {
  private DoubleNode first, last;
  private int size;
  
  DoubleLinkedList(){
      first = last = null;
      size = 0;      
  }
  
  public DoubleNode getFirst(){
      return this.first;
  }
  
  public DoubleNode getLast(){
      return this.last;
  }
  
  public boolean isEmpty(){
      return(first==null);
  }
  
  public int size(){
      return size;
  }
  
  public void insertF(Object data) {

        if (isEmpty()) {
            this.first = new DoubleNode(data,null, null);
            this.last = this.first;
        } else {
            this.first = new DoubleNode(data,this.first,null );
        }
      size++;
    }
  
  public void insertFirst(Object newItem){
      if(isEmpty())
          first = last = new DoubleNode(newItem, null, null);
      else{
          DoubleNode B = new DoubleNode(newItem, first, null);
          first.setNext(B);
          first = B;          
      }
      size++;
  }
  
  public void insertLast(Object newItem){
      if(isEmpty())
          first = last = new DoubleNode(newItem, null, null);
      else{
          DoubleNode B = new DoubleNode(newItem, null, last);
          last.setNext(B);
          last = B;
      }
      size++;
  }
  
  public Object removeFirst() throws ListEmptyException{
      Object removeItem;
      if(isEmpty())
          throw new ListEmptyException("Empty List!!!");
      removeItem = first.getItem();
      if(first==last)
          first = last = null;
      else{
          DoubleNode B = first.getNext();
          first.setNext(null);
          B.setPrevious(null);
          first = B;
      }
      size--;
      return removeItem;
  }
  
  public Object removeLast() throws ListEmptyException{
      Object removeItem;
      if(isEmpty())
          throw new ListEmptyException("Empty List!!!");
      removeItem = last.getItem();
      if(first==last)
          first = last = null;
      else{
          DoubleNode B = last.getNext();
          last.setNext(null);
          B.setPrevious(null);
          last = B;
      }
      size--;
      return removeItem;
  }
  
  public void insert(int position, Object data) throws NoSuchListPosition{
      if(position<size)
          throw new NoSuchListPosition("Wrong Position");
      DoubleNode tmp = first;
      for(int i=0; i<position; i++)
          tmp = tmp.getNext();
    //  if(tmp==first) insertFirst(data);
    //  if(tmp==last) insertLast(data);
      DoubleNode B = new DoubleNode(data, tmp, tmp.getPrevious());
      tmp.getPrevious().setNext(B);
      tmp.setPrevious(B);
      size++;
  }
  
  
  public Object remove(int position) throws ListEmptyException, NoSuchListPosition{
      if(position>size)
          throw new NoSuchListPosition("Wrong Position");
      Object removeItem;
      DoubleNode tmp = first;
      for(int i=0; i<position; i++)
          tmp = tmp.getNext();
      if(isEmpty())
          throw new ListEmptyException("Empty List!!!");
      removeItem = tmp.getItem();
      tmp.getPrevious().setNext(tmp.getNext());
      tmp.getNext().setPrevious(tmp.getPrevious());
      size--;
      return removeItem;
  }
  
  public void printList(){
        if(isEmpty())
            System.out.println("Empty List");
        else{
            DoubleNode current = first;
            while (current!=null){
                System.out.println(current.getItem().toString()+" ");
                current = current.getNext();
            }
            System.out.println("\n");
        }
    }
}
