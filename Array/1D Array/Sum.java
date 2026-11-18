// package Array.1D Array;

public class Sum {
    public static void  main(String[] args){
        int[] myNum = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < myNum.length; i++) {
            sum = sum + myNum[i];
        }
        System.out.println("Sum of all array numbers:"+sum);
    }
}
