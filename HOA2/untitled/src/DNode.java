public class DNode {
    DNode prev;
    DNode next;
    int value;

    public DNode getPrev(){return prev;}
    public void setPrev(DNode newPrev){prev = newPrev;}

    public DNode getNext(){return next;}
    public void setNext(DNode newNext){next = newNext;}

    public int getValue(){return value;}
    public void setValue(int newValue){value = newValue;}

    public DNode(DNode prev, DNode next, int value){
        this.prev = prev;
        this.next = next;
        this.value = value;
    }
}