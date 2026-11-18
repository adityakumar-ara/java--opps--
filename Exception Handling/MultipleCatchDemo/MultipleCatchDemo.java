// Write a program to handle different exceptions using multiple catch statements with a single try block.

class MultipleCatchDemo {
    public static void main(String[] args) {
        
        try {
            // Hum ek 3 size ka array bana rahe hain
            int[] numbers = {10, 20, 30};
            
            System.out.println("Try block started...");
            
            int result = numbers[1] / 0;
            System.out.println("Result: " + result);
            
            System.out.println("Value at index 5: " + numbers[5]); 
            
            System.out.println("Try block ended.");
            
        } 
        catch (ArithmeticException e) {
          
            System.out.println("Error 1: You cannot divide a number by zero!");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
         
            System.out.println("Error 2: Array index is out of bounds!");
        } 
        catch (Exception e) {
          
            System.out.println("Error 3: Some other exception occurred.");
        }
        
        System.out.println("Program execution continues normally.");
    }
}