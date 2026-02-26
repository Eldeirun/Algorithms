public class SLinkedList {
    private int size;
    private Node head;
    private Node tail;

    public void setTail(){
        tail = findLast();
    }

    public SLinkedList(Node head){
        this.head = head;
        size = 1;
    }
    public SLinkedList(){
        size = 0;
    }

    public Node findLast(){
        Node selection = head;
        while(selection.getNext() != null){
            selection = selection.getNext();
        }
        return selection;
    }

    public Node findSecondLast(){
        Node selection = head;
        while((selection.getNext()).getNext() != null){
            selection = selection.getNext();
        }
        return selection;
    }

    public void insertAfter(Node predesecor, Node inserted){
        inserted.setNext(predesecor.getNext());
        predesecor.setNext(inserted);
        size++;
    }

    public void insertAsTail(Node newTail){
        tail.setNext(newTail);
        setTail();
        size++;
    }

    public void insertAsHead(Node newHead){
        newHead.setNext(head.getNext());
        head.setNext(newHead);
        head = newHead;
        size++;
    }

    public int findSum(){
        Node selection = head;
        int sum = 0;
        for(int i = 1; i<size+1; i++){
            sum += selection.getValue();
            selection = selection.getNext();
        }
        return sum;
    }

    public void swapFirstSecond(){  //incomplete
        Node temp = head.getNext();
        Node tempHead = head;
        (head.getNext()).setNext(head);
        head.setNext(temp.getNext());


    }

    public void rotateRight(){
        tail.setNext(head);
        head = tail;
        tail = findSecondLast();
        tail.setNext(null);
    }

}