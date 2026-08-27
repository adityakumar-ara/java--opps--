interface Father {
    void fatherProperty();
}

interface Mother {
    void motherProperty();
}

class Son implements Father, Mother {

    public void fatherProperty() {
        System.out.println("Father Property");
    }

    public void motherProperty() {
        System.out.println("Mother Property");
    }
}

public class Main {
    public static void main(String[] args) {

        Son s = new Son();

        s.fatherProperty();
        s.motherProperty();
    }
}