// package WrapperClass;

class WrapperClassDemo {
    public static void main(String[] args) {
        int num = 5;
        Integer num1 = num;
        double value =99.99;
        double value1 = value;

        // Alternatively, using valueOf() method (Explicit Boxing)
        Integer objIntExplicit = Integer.valueOf(100);

        // 3. Printing the results
        System.out.println("--- Primitive Values ---");
        System.out.println("int value: " + num);
        System.out.println("double value: " + num1);

        System.out.println("\n--- Wrapper Class Objects ---");
        System.out.println("Integer object: " + value);
        System.out.println("Double object: " + value1);
        System.out.println("Explicit Integer object: " + objIntExplicit);
        Integer objInt = Integer.valueOf(num1);
        System.out.println("Integer object (valueOf): " + objInt);
        System.out.println(num1.getClass());
    }
}
