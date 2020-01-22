package outlab3;

/**
 *
 * @author Benjamin Haedt
 */
public class Node {

   final private int data;
   private Node next;
   private Node prev;
   public Node(int d){                  //an instance of our node, 
       this.data = d;
       this.next = null;
       this.prev = null;    
   }
   public Node getNext(){
       return next;
   }
   public Node getPrev(){
       return prev;
   }
   public void setNext(Node temp){
       this.next = temp;
   }
   public void setPrev(Node temp){
       this.prev = temp;
   }
   public int getElement(){
       return data;
   }
}
