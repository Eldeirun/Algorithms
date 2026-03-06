public class NodeHW {

    NodeHW next;
    int value;

    public NodeHW(int value){
        this.value = value;
        this.next = next;
    }

    public boolean areSame(NodeHW comparison){
        return this.value == comparison.value && this.next == comparison.next;
    }
}
