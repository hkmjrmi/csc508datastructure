/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TUF
 */

class Node{
    //Package access data so class List can access it directly
    Object data;
    Node next;
    
    // Create a Node that refers to Object o.
    Node(Object obj)
    {
        // this(o,null);
        data = obj;
        next = null;
    }
    
    //Create a Node that refers to Object o and to the next Node in the List.
    Node (Object o, Node nextNode)
    {
        data = o;
        next = nextNode;
    }
    
    // Return a reference to the Object in this node
    Object getObject(){return data;}
    
    // Return the next node
    Node getNext(){return next;}
}


public class MyQueue {
    private Node front;
    private Node rear;
    private Node newNode;
    
    public MyQueue(){}
    
    public boolean isEmpty()
    {
        return front == null;
    }
    
    // Method to enqueue@insert element in the queue
    public void enqueue(Object elem)
    {
       newNode = new Node(elem);
       if(rear == null)
           rear = front = newNode;
       else{
           newNode.next = front;
           front = newNode;
       }
    }
    
    // Method to dequeue@delete element from the queue
    public Object dequeue()
    {
        //return removeFromFront(};
        Object removeItem = null;
        if(isEmpty()){
                System.out.println("Queue is empty");
        }
        
        removeItem = front.data; // retrive the data
        
        // reset the firstNode and lastNode references
        if( front.equals(rear))
            front = rear = null;
        else
            front = front.next;
        
        return removeItem;
    }
    
    public Object getFront(){
        if(isEmpty())
            return null;
        else
        {
            newNode = front;
            return newNode.data;
        }
    }
    
    public Object getLast()
    {
       if(isEmpty())
           return null;
       else
       {
           newNode = rear;
           return newNode.data;
       }
    }
    
    public void print()
    {
      if ( isEmpty() ) {
         System.out.println( " Queue is Empty ");
         return;
      }

      Node current = front;

      while ( current != null ) {
         System.out.print( current.data.toString() + " " );
         current = current.next;
      }

      System.out.println( "\n" );
   }
}
    
    