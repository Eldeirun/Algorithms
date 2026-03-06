import java.util.Scanner;
public class mainHW {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int amountofElements = keyboard.nextInt(); //This variable is never used in the actual algorithm (in my implementation), but the question said to include it so I did.
        //Apparently it had a use.
        int[] values = new int[amountofElements];
        for(int i = 0; i<amountofElements; i++){
            values[i] = keyboard.nextInt();

        }


        NodeHW n1 = new NodeHW(values[0]);
        /*
        NodeHW n2 = new NodeHW(values[1]);
        NodeHW n3 = new NodeHW(values[2]);
        NodeHW n4 = new NodeHW(values[3]);
        NodeHW n5 = new NodeHW(values[4]);
        NodeHW n6 = new NodeHW(values[5]);
        NodeHW n7 = new NodeHW(values[6]);
        NodeHW n8 = new NodeHW(values[7]);
        NodeHW n9 = new NodeHW(values[8]);
        So unnecesary
        */

        SLinkedListHW sl1 = new SLinkedListHW(n1);
        for (int i = 1; i<amountofElements ; i++){
            sl1.addFromEnd(new NodeHW(values[i]));
        }


        sl1.reverseEvenSequences(amountofElements);

        NodeHW node = sl1.head;
        for (int i = 0; i<sl1.size; i++){
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
}
