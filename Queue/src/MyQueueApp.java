/**
 * Write a description of class MyQueueApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyQueueApp
{
    public static void main( String args[] )
   {
      MyQueue queue1 = new MyQueue();  // Declare queue1
      MyQueue queue2 = new MyQueue(); // Declare queue2
      
      // Create objects to store in the queue
      int num1 = 10;
      int num2 = 20;
      int num3 = 30;
      int num4 = 40;
      int num5 = 50;
      
      queue1.enqueue( num1 );
      queue1.enqueue( num2 );
      queue1.enqueue( num3);
      queue1.enqueue( num4);
      queue1.enqueue( num5);
       
      //To display all data
     System.out.println("Content of queue1: ");
     queue1.print();
      
      //To display first data
     System.out.println("First: "+ queue1.getFront());
      
     while (!queue1.isEmpty())
     {     
          Integer data = (Integer)queue1.dequeue(); // Must dequeue the item first before processing the data
          if (data.intValue() > 10)
            queue2.enqueue(data);
     }
      System.out.println("Content of queue2: ");  
      queue2.print();
     
      System.out.println("Content of queue1: ");  
      queue1.print(); // Note: queue1 is empty because all the data have been dequeued
    
     //To sum all numbers in queue2
      int sum = 0;
      int num;
      System.out.println("Contents of queue2: \n");
      while (!queue2.isEmpty())
      {     
            num = (Integer)queue2.dequeue();
            sum += num;
            System.out.println (""+num);
      }
      
      System.out.println ("SUM of all numbers: "+sum);  
      
      // Write codes here to remove and display the first element in queue2
     
   }    
}