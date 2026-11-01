// WAP to add two numbers using a user input in Java.
import java.util.Scanner;  
class sum1 {
    int a, b, sum;
    int add(int x, int y){
        a=x;
        b=y;
        sum=a+b;    
        return sum;
    }
}
class sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sum1 obj = new sum1();
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        obj.add(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + obj.sum);
    }
}