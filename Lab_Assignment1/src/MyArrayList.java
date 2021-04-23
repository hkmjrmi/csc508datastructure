/**
 * Name: Muhammad Abdul Hakim bin Jurimi
 * Sid#: 2020872304
 * Course:CSC508
 * Group#: CS2304C
 * Due Date: 23/04/2021
 * Program Description:
 */
public class MyArrayList
{
        // default initial capacity
        private static final int INITIAL_CAPACITY = 5; 
        private Object[] theData;   // the array to hold the list elements
        private int size = 0;     // the current size
        private int capacity = 0;   // the current capacity
       

        //Default constructor
        //Creates an array of size 10
        public MyArrayList()
       {
           theData = new Object[INITIAL_CAPACITY];
           capacity = INITIAL_CAPACITY;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        /** Return the number of elements in this list */
        public int size() {
            return theData.length;
        }
        
        public void insertAtFront(Object theValue)
        {
            if(size >= capacity)  //the list is full
                System.err.println("Cannot insert in a full list.");
             else
             {
                 for (int i = size; i > 0; i--)
                    theData[i] =  theData[i-1]; // move elements down
                 
                    theData[0] = theValue;  //insert the item at front
                    size++; //increment the size
              }

        } //end add
        
         public void insertAtBack(Object theValue)
        {
            if(size >= capacity)  //the list is full
                System.err.println("Cannot insert in a full list.");
             else
             {
                
                    theData[size] = theValue;
                    size++; //increment the size
              }

        } //end add
        
        public Object get(int index)
        {
            if(index < 0 || index >= size)
                throw new ArrayIndexOutOfBoundsException(index);
            else
            {
                return theData[index];
            }
        } //end get
        
        // display the elements of the list
        public void display()
        {
            for ( int i = 0; i < size; i++)
            {
                System.out.print(theData[i]);
                System.out.println();
                
            }
        } 
}