import java.util.Scanner;
//Task 6
public class palindromesNum {
    static boolean palindromes(int num){
        int original = num;
        int reversNum = 0;

            while (num != 0) {
                int temporaryNum = num % 10;
                reversNum = (reversNum * 10) + temporaryNum;
                num = num / 10;

            }
            if (reversNum != original) {
                return false;
            }else {
                return true;
            }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       System.out.println(palindromes(number));
    }
}
