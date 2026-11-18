// Write a program to manually throw an exception in a method using the throw keyword.

class ThrowKeywordDemo {
    
    // Method to check if a person is eligible to vote
    static void checkAge(int age) {
        if (age < 18) {
            // Manually throwing an exception using 'throw'
            throw new ArithmeticException("Access denied - You must be at least 18 years old to vote.");
        } else {
            System.out.println("Access granted - You are eligible to vote!");
        }
    }

    public static void main(String[] args) {
        
        System.out.println("Testing with age 15:");
        try {
            // This will fail the condition and throw the exception
            checkAge(15); 
        } catch (ArithmeticException e) {
            // Catching the manually thrown exception
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("\nTesting with age 20:");
        // This will pass the condition and run normally
        checkAge(20); 
    }
}