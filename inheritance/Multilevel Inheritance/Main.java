class Father {

    String shop;
    String fatherName;
    double balance;

    void property() {
        shop = "Photocopy Shop";
        fatherName = "Aditya";
        balance = 10000000;
    }
}

class Son1 extends Father {

    String son1Name;
    int age;
    double son1Balance;

    void setSon1() {
        son1Name = "Gugu";
        age = 25;
        son1Balance = 2500;
    }

    void display1() {
        System.out.println("Son1 Name: " + son1Name);
        System.out.println("Son1 Age: " + age);
        System.out.println("Son1 Balance: " + son1Balance);

        System.out.println("Father Shop: " + shop);
        System.out.println("Father Name: " + fatherName);
        System.out.println("Father Balance: " + balance);
        System.out.println("_____________________________________");
    }
}

class Son2 extends Son1 {

    String son2Name;
    int son2Age;
    double son2Balance;

    void setSon2() {
        son2Name = "OM";
        son2Age = 37;
        son2Balance = 4500;
    }

    void display2() {
        // display1(); //Nesting method
        System.out.println("Son2 Name: " + son2Name);
        System.out.println("Son2 Age: " + son2Age);
        System.out.println("Son2 Balance: " + son2Balance);

        System.out.println("Father Shop: " + shop);
        System.out.println("Father Name: " + fatherName);
        System.out.println("Father Balance: " + balance);

        System.out.println("Son1 Name: " + son1Name);
        System.out.println("Son1 Age: " + age);
        System.out.println("Son1 Balance: " + son1Balance);
    }
}

public class Main {

    public static void main(String[] args) {

        Son2 s2 = new Son2();

        s2.property();
        s2.setSon1();   
        s2.setSon2();   
        s2.display2();
    }
}