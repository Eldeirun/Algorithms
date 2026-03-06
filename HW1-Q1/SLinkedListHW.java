public class SLinkedListHW {
    NodeHW head;
    NodeHW tail;
    int size;

    public void findTail(){
        NodeHW finding;
        NodeHW current = head;

        while(current.next != null){
            current = current.next;
        }
        finding = current;
        tail = finding;
    }

    public SLinkedListHW(NodeHW head, NodeHW tail){
        this.head = head;
        this.tail = tail;
        size = 2;
    }

    public SLinkedListHW(NodeHW head){
        this.head = head;
        findTail();
        size = 1;
    }


    public void addFromEnd(NodeHW newNode){
        tail.next = newNode;
        newNode.next = null;
        findTail();
        size++;
    }

    public void addAfter(NodeHW newNode, NodeHW prev){
        NodeHW newNext = prev.next;
        prev.next = newNode;
        newNode.next = newNext;
        size++;
        findTail();
    }

    public void addFromHead(NodeHW newHead) {
        newHead.next = head;

        head = newHead;
        size++;
        findTail();
    }

    public void reverseEvenSequences(int amountOfElements){

        NodeHW prevNode = null;
        NodeHW current = this.head;

        while (current != null){
            if (current.value % 2 != 0){
                prevNode = current;
                current = current.next;
            }
            else{
                NodeHW start = current;

                while (current != null && current.value % 2 == 0){
                    current = current.next;
                }
                NodeHW nextNode = current;

                NodeHW prev = null;
                NodeHW runner = start;

                while (runner != nextNode){
                    NodeHW temp = runner.next;
                    runner.next = prev;
                    prev = runner;
                    runner  = temp;


                }

                if (prevNode != null){
                    prevNode.next = prev;
                }
                else {
                    this.head = prev;
                }
                start.next = nextNode;
                prevNode = start;
            }
        }

    }
}
