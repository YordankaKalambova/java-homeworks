import java.util.Scanner;

public class triangle {
    public static void main (String []arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firs angle");
        int firstAngle = sc.nextInt();
        System.out.println("Enter second angle");
        int secondAngle = sc.nextInt();
        System.out.println("Enter third angle");
        int thirdAngle = sc.nextInt();
        if (firstAngle + secondAngle + thirdAngle == 180) {
            System.out.println("The triangle can be built based on the angle values");
            if ((firstAngle == secondAngle) && (secondAngle == thirdAngle) && (firstAngle == thirdAngle)) {
                System.out.println("Triangle is equilateral");
            } else if ((firstAngle == secondAngle) || (secondAngle == thirdAngle) || (firstAngle == thirdAngle)) {
                System.out.println("Triangle is isosceles");
            } else {
                System.out.println("Triangle is multifaceted");
            }
            if (firstAngle == 90 || secondAngle == 90 || thirdAngle == 90) {
                System.out.println("Triangle is right-angled");
            } else if (firstAngle > 90 || secondAngle > 90 || thirdAngle > 90) {
                System.out.println("Triangle is obtuse");
            } else {
                System.out.println("Triangle is acute");
            }

        } else {
            System.out.println("The triangle can’t be built based on the angle values");
        }


    }
}
