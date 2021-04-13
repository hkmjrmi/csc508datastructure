public class Student
{
    public String name;
    public long id;
    public int score;
    
    // Default Constructor
    public Student(){
        name=null;
        id = 0;
        score = 0;
    }
    
    // Parameterized Constructor
    public Student(String n, long i, int s){
        name = n;
        id = i;
        score = s;
    }
    
    // Accessors
    public String getName(){
        return name;
    }
    
    public long getID(){
        return id;
    }
    
    public int getScore(){
        return score;
    }
    
    public String toString(){
         return  "Name:" +name+ " Student ID:" +id+ " Score:" +score;
    }
    
    
}
