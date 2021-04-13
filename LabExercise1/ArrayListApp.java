import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListApp
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        ArrayList<Student> studList = new ArrayList<Student>();
        String nm;
        long id;
        int sc;
        
        double totScores = 0;
        
        System.out.print ("Number of students:");
        int num = in.nextInt();
        
        for(int i=0; i<num; i++)
        {
            System.out.print("\nEnter Name: ");
            nm = (in.next());
            
            System.out.print("Student ID: ");
            id = in.nextLong();
            
            System.out.print("Student Score: ");
            sc = in.nextInt();
        
        
            Student stud = new Student(nm,id,sc);
        
            studList.add(stud);
        } 
        
        System.out.println("\nStudent Details: ");
        for (int i = 0; i < studList.size(); i++)
            System.out.println(studList.get(i));
        
        for(int i=0; i < studList.size(); i++){
            Student stud = studList.get(i);
            totScores = totScores + stud.getScore();
        }
        
        System.out.println("\nTotal Score : " +totScores);
        System.out.println("\nAverage score: " +(totScores/num));
        
        int min = 0;
        Student stud2 = studList.get(0);
        for(int i=0; i<studList.size(); i++)
        {
            Student stud = studList.get(i);
            
            if(stud.getScore()<stud2.getScore()){
                min = stud.getScore();
            }
        }
        System.out.println("\nMinimum Score: "+min);
        
        int max = 0;
        for(int i=0; i<studList.size(); i++)
        {
            Student stud = studList.get(i);
            if(stud.getScore() > max)
            {
                max = stud.getScore();
            }
            
        }
        System.out.println("\nMaximum Score: "+max);
        
        System.out.println("\nList name of student who score higher than 50");
        for(int i=0; i<studList.size(); i++)
        {
            Student stud = studList.get(i);
            
            if(stud.getScore() >= 50){
                System.out.println(stud.getName());
            }
        }
    }
}
