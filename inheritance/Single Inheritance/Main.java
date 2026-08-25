// package inheritance;
// package multiple_inheritance;

class Father {
    String shop; 
    int balance;
    void Property(){
        shop = "generalshop";
        balance = 250000;
    }
}
class Son extends Father {
        void display(){
         System.out.println("Father property:"+ shop );
         System.out.println("Father property:"+ balance );
}
}

public class Main{
    public static void main(String[] args) {
        Son s = new Son();
        s.Property();
        s.display();
    }

}
