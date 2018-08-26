public class SLListNode{ 
    private Object data;
    private SLListNode nextNode;

    SLListNode(){
        this(null, null);
    }
    SLListNode(Object data, SLListNode nextNode){
        this.data=data;
        this.nextNode=nextNode;
    }
    
    public Object getNodeData(){
        return this.data;
    }
    
    public SLListNode getNextNode(){
        return this.nextNode;
    }
            
    public void setNodeData(Object data){
        this.data=data;
    }
    
    public void setNextNode(SLListNode nextNode){
        this.nextNode=nextNode;
    }
    
   /* public String toString(){
        String s="";
        s+="Data :"+data+" NextNode : "+nextNode;
        return s;
    }*/
}