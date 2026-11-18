// Create a User-Defined Exception class (e.g., InvalidAgeException) and write a program to generate and handle this custom exception.

// 1. Creating the User-Defined (Custom) Exception Class
class InvalidAgeException extends Exception {
    // Constructor that passes the error message to the parent Exception class
    public InvalidAgeException(String message) {
        super(message);
    }
}

// 2. Main class to test our custom exception
class CustomExceptionDemo {
    
    // Method that uses 'throws' to declare it might throw our custom exception
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Generating (throwing) the custom exception manually
            throw new InvalidAgeException("Age is less than 18. Not eligible to vote!");
        } else {
            System.out.println("Age is valid. You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Voter Registration System");
        System.out.println("-------------------------");
        
        try {
            System.out.println("Testing with age 16:");
            // This will fail the condition and throw InvalidAgeException
            checkAge(16); 
        } 
        catch (InvalidAgeException e) {
            // Handling our custom exception
            System.out.println("Custom Exception Caught -> " + e.getMessage());
        }
        
        System.out.println("\nProgram execution finished safely.");
    }
}