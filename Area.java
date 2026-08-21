class Area {
    int length; 
    int breadth; 
    int area;
    void getdata(int a, int b){
        length = a;
        breadth = b;

    }
    void  calc(){
        area = length*breadth;
    }
    void display()
       { System.out.println("Area ="+area);
    }

}
class RoomArea {
    public static void main(String args[]) {
        Area r1 = new Area();
        r1.getdata(14,10);
        r1.calc();
        r1.display();
    }
}