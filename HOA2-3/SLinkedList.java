import java.util.Queue;

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

    public void removeNode(Node n){
        Node selection = head;
        while (selection.getNext().getNext() != n){
            selection = selection.getNext();
        }
        selection.setNext(n.getNext());
        n.setNext(null);
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

    public void swapFirstSecond(){
        Node temp1 = head;
        Node temp2 = head.getNext();

        temp1.setNext(temp2.getNext());
        temp2.setNext(temp1);
        head = temp2;


    }

    public void rotateRight(){
        tail.setNext(head);
        head = tail;
        tail = findSecondLast();
        tail.setNext(null);
    }

    public static boolean isIdentical(SLinkedList sll1, SLinkedList sll2){
        boolean identical = true;
        if (sll1.size != sll2.size){
            identical = false;
        }
        else {
            Node selection = sll1.head;
            Node comparison = sll2.head;
            for (int i = 0; i<sll1.size; i++){
                if(selection.getValue() == comparison.getValue() && selection.getNext() == comparison.getNext()){
                    selection = selection.getNext();
                    comparison = comparison.getNext();
                }
                else{
                    identical = false;
                }

            }
        }
        return identical;
    }

    public void moveContents(Queue<String> q){

        /*
        Node selection = head;
        Node temp = selection;
        for (int i = 0; i<size; i++){
            q.add((new Integer(selection.getValue())).toString()); //int :/
            selection = selection.getNext();
            removeNode(temp);
            temp = selection;
        */
        for (int i = 0; i<size; i++){
            q.add((new Integer(head.getValue())).toString());
            Node temp = head;
            head = head.getNext();
            temp.setNext(null);
        }
        size = 0;
    }

    public void removeEverySecondNode(SLinkedList sl){
        Node selection = sl.head;
        for (int i = 0; i<sl.size; i++){
            if (i%2 == 1){
                Node temp = selection.getNext();
                sl.removeNode(selection);
                selection = temp;
            }
            else{
                selection = selection.getNext();
            }
        }
    }

}