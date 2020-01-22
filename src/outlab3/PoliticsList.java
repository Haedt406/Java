package outlab3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Benjamin Haedt
 */
public class PoliticsList {                                                     //our class that creates an instance of a politics list and allows us to create and manipulate a double circular linked list. 

    private Node first;
    final private int N;
    final private int k;
    final private int m;

    PoliticsList(int N, int k, int m) {
        first = null;
        this.N = N;
        this.k = k;
        this.m = m;

    }

    public void remove(int nodeToRemove) {                                                  //the method to remove the node sent to it.
        if (first.getNext() == first) {
            first = null;
            return;
        }
        Node temp = first;
        while (temp != null) {
            if (temp.getElement() == nodeToRemove) {
                if (temp == first) {
                    first.getNext().setPrev(first.getPrev());
                    first.getPrev().setNext(first.getNext());
                    first = first.getNext();
                    return;
                }
                if (temp.getNext() != null) {
                    temp.getNext().setPrev(temp.getPrev());
                }
                temp.getPrev().setNext(temp.getNext());
                return;
            } else {
                temp = temp.getNext();
            }
        }
    }
//        
//
//        if (temp == first)
//        {
//           Node prev = temp.getPrev();
//           Node next = temp.getNext();
//            first.getNext().setPrev(prev);
//            first.getPrev().setNext(next);
//            first = first.getNext();
//        }
//        else{
//
//           Node prev = temp.getPrev();
//           Node next = temp.getNext();
//            prev.setNext(next);
//            next.setPrev(prev);  
//        }
//    }
//    public void kSelector(int jumps){
//        Node temp = first;
//       
//        for (int temp = 1; temp < jumps; temp++){
//            temp = temp.getNext();
//        }
//        //System.out.println(temp.getElement());
//        remove(temp);
//    }
//        public void mSelector(int jumps){
//        Node temp = first;
//       
//          for (int temp = 1; temp < jumps; temp++){
//            temp = temp.getPrev();
//        }
//        remove(temp);
//    }



//    public void setFirst() {
//        first = first.getNext();
//    }

    public void add(Node data) {                                                 //adds nodes to our linked list
        //   size += 1;
        if (first == null) {
            first = data;
            first.setNext(first);
            first.setPrev(first);
        } else {
            Node before = first.getPrev();
            before.setNext(data);
            data.setPrev(before);
            data.setNext(first);
            first.setPrev(data);
        }

    }

    public int nPrint() {
        return this.N;
    }

    public int kPrint() {
        return this.k;
    }

    public int mPrint() {
        return this.m;
    }

    public void addPolitics() {                                                  //method called to add N amount of nodes, calling the node method each time to create a new one
        for (int i = 1; i <= N; i++) {
            Node node = new Node(i);
            this.add(node);
        }
    }
//    public void moves(){
//            while(first != null){
//            k = this.efficiencyMod(k);                  
//                        m = this.efficiencyMod(m);
//                        this.kSelector(k);
//                        this.mSelector(m);
//                    }
//    }
//    public void print(){
//        Node temp = first;
//        if( size == 0){
//            System.out.println("List is empty");
//        }
//        for (int temp = 0; size > temp; temp++){
//        System.out.println(temp.getElement());
//        temp = temp.getNext();
//        }
//    }
//    public int size(){
//        return size;
//    }

//    public int last(){
//        Node temp = first;
//       temp = temp.getPrev();
//       return temp.getElement();
//    }
//    public int first(){
//        Node temp = first;
//       return temp.getElement();
//    }
    public void candidateSelector() throws IOException {                               //our method to cycle through the candidateSelector using our k and m values
        Node kNode = first;
        Node mNode = first.getPrev();
        PrintWriter addOutput = new PrintWriter(new FileWriter("LinkedListProgram.txt", true));
        addOutput.println("N = " + this.nPrint() + ", k = " + this.kPrint() + ", m= " + this.mPrint());
        addOutput.println();
        addOutput.println("Ouput");
        addOutput.println("---------");
        addOutput.println();
        while (first != null) {
            int clockWise = k % N;                                   //uses the mod operator to make our jumps efficient, never having to go around more then once.
            int counterClockwise = m % N;
            for (int i = 1; i < clockWise; i++) {                                 // uses our modded k values to find what node on the linked list we will delete
                kNode = kNode.getNext();
            }

            for (int i = 1; i < counterClockwise; i++) {                          // uses our modded m values to find what node on the linked list we will delete
                mNode = mNode.getPrev();
            }
            if (kNode == mNode) {                                                 //if the value of k and m point to the same node, we push each one to either side of the node they both landed on and remove the value 
                addOutput.println(kNode.getElement());

                int temp = kNode.getElement();

                kNode = kNode.getNext();
                mNode = mNode.getPrev();

                remove(temp);
            } else {                                                            //remove the elements k and m land on              
                addOutput.println(kNode.getElement() + " " + mNode.getElement());
                int temp = kNode.getElement();
                kNode = kNode.getNext();
                remove(temp);
                temp = mNode.getElement();
                mNode = mNode.getPrev();
                remove(temp);
                if (kNode.getElement() == temp) {
                    kNode = kNode.getNext();
                }
            }
        }
        addOutput.println();
        addOutput.close();

    }

}
