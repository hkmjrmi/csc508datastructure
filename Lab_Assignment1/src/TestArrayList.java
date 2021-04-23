/**
 * Name: Muhammad Abdul Hakim bin Jurimi
 * Sid#: 2020872304
 * Course:CSC508
 * Group#: CS2304C
 * Due Date: 23/04/2021
 * Program Description:
 */

import java.util.Scanner;
public class TestArrayList {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        // a. Declare a MyArrayList object named empList.
        MyArrayList empList = new MyArrayList(); 
        
        // f. Declare another MyArrayList object named empHigh.
        MyArrayList empHigh = new MyArrayList();
        
        double totalSalary=0.0;
        double average = 0.0;
        double maxSalary=0.0;
    
        
        // b.Insert FIVE (5) Employee objects at the end of the list.
        for(int i=0;i<empList.size();i++){
            System.out.print("\nName:");
            String name=in.next();
            System.out.print("ID:");
            String id=in.next();
            System.out.print("Salary:RM ");
            double salary=in.nextDouble();
            
            Employee emp = new Employee(name,id,salary);
            empList.insertAtBack(emp);
            
            // c. Calculate and display the total salary.
            totalSalary=totalSalary+emp.getSalary();
            // d. Compute and display the average of the salaries.
            average=totalSalary/empList.size(); 
            
           
           
            // e. Find and display the maximum salary.
            if(emp.getSalary()>maxSalary){
                maxSalary=emp.getSalary();
            }
           
            
            // g. Insert all employees with salary > 5000 from empList into empHigh.
            if(salary>5000){
                
               Employee employee = new Employee(name,id,salary);
               empHigh.insertAtBack(employee);
            }        
        }
        
        // e. Find and display the minimum salary
        Employee temp = (Employee)empList.get(0);
        double minSalary = temp.getSalary();
        for(int i=0;i<empList.size();i++){
            Employee temp2 = (Employee)empList.get(i);
            if(temp2.getSalary()<minSalary){
                minSalary=temp2.getSalary();
            }
        }
        
        
        // h. Display the details of ALL employees in the array list empList and empHigh.
        System.out.print("EmpList");
        empList.display();
        
        System.out.println("EmpHigh");
        empHigh.display();
        
        System.out.println();
        
        System.out.println("Maximum Salary:RM "+maxSalary);
        
        System.out.println("Minimum Sakary:RM "+minSalary);
        
        System.out.println("Total Salary:RM "+totalSalary);
        
        System.out.println("Average Salary:RM "+average);   
    }
}
