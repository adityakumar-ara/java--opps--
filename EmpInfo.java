public class EmpInfo {
    int id, allowance; 
    double  salary;
    void getinfo(int a, int b, int c){
        id = a;
        allowance = b;
        salary = c;
    }
    void display(){
        System.out.println("id:" +id);
        System.out.println("Allowance:" +allowance);
        System.out.println("Salary:" +salary);
    }
}
class Employee{
    public static void main(String[] args) {
        EmpInfo e1 = new EmpInfo();
        e1.getinfo(1, 250, 300);
        e1.display();
    }
}