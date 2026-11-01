// Create a program to demonstrate the use of jump statements (break and continue) in loops.

class JumpStatementsDemo {
    public static void main(String[] args) {
        
        System.out.println("Demonstrating 'continue' statement:");
        // The continue statement skips the current iteration and moves to the next one.
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping iteration " + i);
                continue; // Skips printing 3
            }
            System.out.println("Value: " + i);
        }

        System.out.println("\n---------------------------\n");

        System.out.println("Demonstrating 'break' statement:");
        // The break statement terminates the entire loop immediately.
        for (int j = 1; j <= 5; j++) {
            if (j == 4) {
                System.out.println("Breaking the loop at iteration " + j);
                break; // Stops the loop when j reaches 4
            }
            System.out.println("Value: " + j);
        }
    }
}