
/**
 * Name: Muhammad Abdul Hakim bin Jurimi
 * Sid#: 2020872304
 * Course:CSC508
 * Group#: CS2304C
 * Due Date: 23/04/2021
 * Program Description:
 */
public class Employee {
    
    protected String name;
    protected String id;
    protected double salary;
    
    
    public Employee(){
        this.name = "";
        this.id = "";
        this.salary= 0.0;
    }
    
    public Employee(String name, String id, double salary){
        this.name= name;
        this.id = id;
        this.salary= salary;
    }
        
    public String getName(){return name;}
    public String getID(){return id;}
    public double getSalary(){return salary;}
    
    public void setName(){ this.name = name;}
    public void setID(){ this.id = id;}
    public void setSalary(){this.salary = salary;}
    
   
    public String toString(){
        return("\nName:"+name+"\nID:"+id+"\nSalary:RM "+salary);
    }

}
