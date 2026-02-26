public class Node {
    private int value;
    private Node next;

    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }

    public int getValue(){return value;}
    public void setValue(int newValue){value = newValue;}

    public Node getNext(){return next;}
    public void setNext(Node newNext){next = newNext;}

}