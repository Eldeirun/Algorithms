public class DLinkedList {
    int size;
    DNode head;
    DNode tail;

    public DNode getLast(){
        DNode selection = head;
        while (selection.getNext() != null){
            selection = selection.getNext();
        }
        tail = selection;
        return selection;
    }

    public void remove(DNode n){
        (n.getPrev()).setNext(n.getNext());
        (n.getNext()).setPrev(n.getPrev());
        size -= 1;
    }

    public DNode search(int k){
        DNode selection = head;

        for (int i = 0; i<k+1; i++){
            selection = selection.getNext();
        }
        return selection;
    }

    public void removeLast(){
        remove(tail);
    }

}