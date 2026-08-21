public class Pallindrome {
    public static void main(String[] args) {
        int num = 1222;
        int r,sum=0;
        int realnum = num;
       while(num>0){
        r = num % 10;
        sum = sum*10+r;
        num = num /10;
       }
       if(realnum == sum){
        System.out.println("YES This Number Pallindrome \n" + realnum);
       }
       else{
        System.out.println("No This Number Pallindrome \n" + realnum);
       }
    }
}
