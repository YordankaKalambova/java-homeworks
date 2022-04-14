import java.util.Scanner;
// Task5
public class isEven {
    static boolean evenNum(int x) {
        if (x % 2 == 0)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(evenNum(x));
    }
}
