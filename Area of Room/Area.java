// Write a program to calculate area of a room unsign inheritace
class Room {
    int length = 10;
    int width = 5;
}

class Area extends Room {

    void calculateArea() {
        int area = length * width;
        System.out.println("Area of Room = " + area);
    }
}

class Main {
    public static void main(String[] args) {

        Area obj = new Area();
        obj.calculateArea();

    }
}