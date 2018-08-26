public class ArrayStack implements Stack {
    
    
    public ArrayStack(){}
    
    private static int deikths=0;
    
    
    public static int getdeikths(){
        return deikths;
    }
    
    
    private static Object[] pin;
    
    public static void setPin(int megethos){
        pin=new Object[megethos];
    }
    

    
    public int size() {
        return deikths;
    }

   
    public boolean isEmpty() {
        return(deikths==0);
    }

    public boolean isFull() {
        for(int i=0;i<pin.length;i++)
            if(pin[i]!=null)
                return true;
        return false;
       
    }

    public Object top() throws StackEmptyException {
       if(isEmpty())
           throw new StackEmptyException("Stack is empty");
       return pin[deikths-1];
    }

    public void push(Object item) throws StackFullException {
      if(size()==pin.length)
          throw new StackFullException("Stack overflow");
      pin[deikths++]=item;
    }

    public Object pop() throws StackEmptyException {
        Object element;
        if(isEmpty())
            throw new StackEmptyException("Stack is empty");
        element=pin[deikths-1];
        pin[--deikths]=null;
        return element;
        
        
    }
    
    
    
    
    
}
