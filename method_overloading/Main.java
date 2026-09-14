// Same class mein same method ka naam, lekin parameters different.
class CALCULATOR{
    int add(int a, int b){
        return  a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    int add(int a,int b,int c, int d){
        return a+b+c+d;
    }
    
}
class Main{
   public static void main(String[] args) {
       CALCULATOR calc = new CALCULATOR();
       System.out.println(calc.add(2,4));
       System.out.println(calc.add(2, 4, 6));
       System.out.println(calc.add(2, 4, 6, 8)); 
   }
}