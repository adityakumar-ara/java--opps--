class ZeroException {
    
    // Method to perform division
    int Division(int n, int m) {
        // Seedha n ko m se divide karo
        int result = n / m; 
        return result;
    }
    
    void Display(int result) {
        System.out.println("Result: " + result);
    }
}

public class ArithmeticException{ // Class ka naam thoda theek kar diya
    public static void main(String[] args) {
        
        ZeroException obj = new ZeroException();
        
        try {
            // Exception check karne ke liye 10 ko 0 se divide karke dekhte hain
            int result = obj.Division(10, 0); 
            obj.Display(result);
        } 
        catch(java.lang.ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}