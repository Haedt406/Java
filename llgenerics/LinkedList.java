/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llgenerics;

/**
 *
 * @author Togusa
 */
public class LinkedList <E extends Comparable>
{   
    private Node<E> first;
    
    LinkedList()
    {
        
        //
        first = null;
    }
    
    public void remove (Node<E> data)
    {
        Node<E> toRemove = first.getNext();
        Node<E> before;
        Node<E> after;
        
        while ((data.getData().compareTo(toRemove.getData()) != 0)
            && (toRemove != first))
        {
            toRemove = toRemove.getNext();
        }
        
        if (toRemove != first)
        {
            before = toRemove.getPrevious();
            after = toRemove.getNext();
            
            before.setNext(after);
            after.setPrevious(before);
        }
    }
    
    public void add (Node<E> data)
    {
        if(first == null){
            first = data;
            data.setNext(data);
            data.setPrevious(data);
        }
        
        Node<E> before = first.getPrevious();
        Node<E> after = first;
        
        before.setNext(data);
        after.setPrevious(data);
        data.setNext(after);
        data.setPrevious(before);
    }
    
    public void addInOrder (Node<E> data)
    {
        Node<E> before;
        Node<E> after = first.getNext();
        
        while (data.getData().compareTo(after.getData()) > 0)
        {
            after = after.getNext();
        }
        
        before = after.getPrevious();
        before.setNext(data);
        after.setPrevious(data);
        data.setNext(after);
        data.setPrevious(before);
    }
    
    public void print()
    {
        Node<E> temp = first;
        if (first != null){
            System.out.println(first.getData());
            temp = temp.getNext();
        }
        else
            System.out.println("List is empty");
        
        while (temp != first)
        {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
    
    public void printBackwards()
    {
        Node<E> temp = first.getPrevious();
        while (temp != first)
        {
            System.out.println(temp.getData());
            temp = temp.getPrevious();
        }
    }
}
