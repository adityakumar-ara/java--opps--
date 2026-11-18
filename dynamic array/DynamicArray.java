
// Write a program to create a dynamic array and add/remove elements using the Vector class.

class Array {
    private int Arr[];
    private int count;

     // Method to return length of array
    public Array(int size){
        Arr = new int [size];
    }

      // Method to print array
    public void printArray(){
        for (int i = 0; i < count; i++) {
          System.out.println(Arr[i]+"");
        }
    }

    // Method to insert element in array
    public void insert(int ele){
        if (Arr.length == count) {
           int newArr[] = new int[2*count];
            for (int i = 0; i < count; i++) 
               newArr[i]=Arr[i];

           // Assigning new array to original array
           Arr = newArr;
        }  
        Arr[count++]=ele; 
    }

}
public class DynamicArray{
    public static void main(String[] args) {
        // Creating object of Array(user-defined) class
        Array numbers = new Array(1);
        
        // Adding elements to array
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        // Extra element exceeding array size
        numbers.insert(50);
        numbers.insert(60);

        	// Calling printArray() method
        numbers.printArray();
    }
}
