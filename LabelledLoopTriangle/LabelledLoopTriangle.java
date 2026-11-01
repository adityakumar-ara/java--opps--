// Write a program to print a triangle star pattern using nested loops and labelled loops.

class LabelledLoopTriangle {
    public static void main(String[] args) {
       outerLoop:
        for (int i = 1; i <= 5; i++) {
            for ( int j = 1; j <= 5; j++) {
                System.out.print("* ");
                if (j == i) {
                    System.out.println();
                    continue outerLoop;
                }
            }
            
        }
    }
}