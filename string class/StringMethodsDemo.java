// package string class;
// Write a program to use built-in methods (length, charAt, concat) of the String class in Java
public class StringMethodsDemo { 
    public static void main(String[] args) {
        String s = "My name is aditya";

        System.out.println("Length: " + s.length());//Find lenght of totel char.
        System.out.println("Character at index 0: " + s.charAt(0));// find char of index 0 
        System.out.println("Concat: " + s.concat("!")); //Add string after last index
    }
}