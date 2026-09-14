
import java.util.Scanner;

//package nestedmethod;

public class Nesting {
   int age;
   String state;
   void vote(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your age");
    age = sc.nextInt();
    System.out.println("Enter your state");
    state = sc.next();

    if(age >= 18 && state.equalsIgnoreCase("bihar")){
       System.out.println("You are Eligible for vote in bihar");
    }
    else{
      System.out.println("You are not eligible for vote for bihar");
    }
   }  
   void vote(int age, String state){
     if (age >= 10 && !state.equalsIgnoreCase("bihar")){
      System.out.println(".(You are  eligible for vote of your state)");
     }
     else{
      System.out.println("Your are eligible for vote in Bihar ");
     }
   }
   public static void main(String[] args){
   Nesting myVote = new Nesting();
   myVote.vote();
   myVote.vote(12,"Up");

}
}


