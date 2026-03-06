public class Stack {
    int size;
    int filledSize;
    String[] implementationArray;

    public Stack(int size) {
        this.size = size;
        filledSize = 0;
        implementationArray = new String[size];

    }

    public void push(String item) {
        implementationArray[filledSize] = item;
        filledSize++;
    }

    public String pop() {
        String poppedItem = implementationArray[filledSize - 1];
        implementationArray[filledSize - 1] = null;
        filledSize--;
        return poppedItem;
    }

}