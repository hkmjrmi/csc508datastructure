/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TUF
 */
import java.util.*;
public class QueueApp {
    public static void main(String args[])
    {
        MyQueue qList = new MyQueue();
        MyQueue qList2 = new MyQueue();
        Scanner in = new Scanner(System.in);
        
     // Step 2: Input data for object
        String name;
        int prt, num,stuId;;
        double score;
        
        System.out.println(" How many students? ");
        num = in.nextInt();
            
        for (int i = 0; i < num; i++)
        {
            System.out.println(" Enter name:");
            name = in.next();
            System.out.println(" Enter id:");
            stuId= in.nextInt();
            System.out.println(" Enter part:");
            prt = in.nextInt();
            System.out.println(" Enter score:");
            score = in.nextDouble();
             
            // Step 3: Create and store data into object
            Student stud = new Student (name, stuId, prt, score);
       
            // Step 4: insert object at front into linked list
            qList.enqueue(stud);
        }
            qList.print(); // display the elements in the list
            
            // Find the total score
             double sum = 0.0;
             int count = 0;
             Student obj;
             double maxScore = 0.0;
             double minScore = 0.0;
          
           while (!qList.isEmpty())
           {
                 obj = (Student)qList.dequeue();
                 qList2.enqueue(obj);
                 
                 sum += obj.getScore();  
                 if(obj.getScore()>maxScore)
                     maxScore = obj.getScore();
                 
                 
                minScore = obj.getScore(); 
           }   
           
           
           System.out.println ("Total score " + sum );
         
           // Complete the exercises
          // Find the highest and lowest score in the queue
         
          System.out.println("Highest Score: "+maxScore); 
          
          while(!qList2.isEmpty())
          {
              obj = (Student)qList2.dequeue();
              if(obj.getScore()<minScore)
                  minScore = obj.getScore();
          }
          
          System.out.println("Lowest Score: "+minScore);
          
          // Calculate how many students earned score above 80
          System.out.println("Number of students earned score above 80: "+count);
           
    }                          
}
