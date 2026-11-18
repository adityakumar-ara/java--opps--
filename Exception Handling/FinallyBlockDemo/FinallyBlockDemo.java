// Write a program using the finally keyword to ensure code execution whether an exception occurs or not.

class FinallyBlockDemo {
    public static void main(String[] args) {
        
        System.out.println("Program started...\n");
        
        try {
            int a = 10;
            int b = 0; // Zero se divide karne par error aayega
            System.out.println("Inside try block: Trying to divide " + a + " by " + b);
            
            int result = a / b;
            System.out.println("Result: " + result); // Error aane par ye line skip ho jayegi
        } 
        catch (ArithmeticException e) {
            System.out.println("Inside catch block: Exception caught! Cannot divide by zero.");
        } 
        finally {
            // Ye block har haal me chalega, chahe upar error aaya ho ya nahi
            System.out.println("Inside finally block: This will always execute.");
        }
        
        System.out.println("\nProgram ended normally.");
    }
}