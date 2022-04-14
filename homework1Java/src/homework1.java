import java.util.Scanner;

public class homework1 {
    public static void main(String[] arg) {
        //task 7
      /*  int arr[] = {10, 20, 30, 40, 50};
       for(int i = 4; i>=0;i--){
           System.out.println(arr[i]);

       }*/
        // task 6
       /* int list1[] = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] % 5 == 0) {
                System.out.println(list1[i]);
            }
            if (list1[i] >= 150) {
                break;
            }

        }*/
        // tesk 1
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of day");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("The 1-st day of the week is monday");
                break;
            case 2:
                System.out.println("The 2-nd day of the week is tuesday");
                break;
            case 3:
                System.out.println("The 3-rd day of the week is wednesday");
                break;
            case 4:
                System.out.println("The 4-th day of the week is thursday");
                break;
            case 5:
                System.out.println("The 5- day of the week is friday");
                break;
            case 6:
                System.out.println("The 6-st day of the week is saturday");
                break;
            case 7:
                System.out.println("The 7-st day of the week is sunday");
                break;
            default:
                System.out.println("Uncorrected input day");

        }
*/
        //task 2
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if (age >= 16) {
            System.out.println("You are eligible to work.");
        } else {
            System.out.println("You are not eligible to work.");
        }
*/
        // Task 4
      /*  int arr[] = {50, 70, 2, 3, 80, 96, 4, 77};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("This is max element: " +  max);
*/

        // Task 3
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit price:");
        int price = sc.nextInt();
        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();
        int allPrice = 0;
        double discount = 0.0;
        double revenue = 0.0;
        if (quantity >= 100 && quantity < 120) {
            allPrice = price * quantity;
            discount = allPrice * 0.15;
            revenue = allPrice - discount;
            System.out.println("The revenue from sale:" + revenue + "$");
            System.out.println("After discount:" + discount + "$ (15.0%)");
        } else if (quantity >= 120) {
            allPrice = price * quantity;
            discount = allPrice * 0.2;
            revenue = allPrice - discount;
            System.out.println("The revenue from sale:" + revenue + "$");
            System.out.println("After discount:" + discount + "$ (20.0%)");
        } else {
            allPrice = price * quantity;
            System.out.println("The revenue from sale:" + allPrice + "$");
        }
*/
        // task 5
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter your destination");
        String destination = sc.next();
        System.out.println("Enter your vacation budget. ");
        int price = sc.nextInt();
        if (destination.equals("Beach") && price <= 30) {
            System.out.println("Bulgaria - Arapq");
        } else if (destination.equals("Beach") && price > 30) {
            System.out.println("Outside Bulgaria - Greece");
        } else if (destination.equals("Mountain") && price <= 50) {
            System.out.println("Bulgaria - Pirin");
        } else if (destination.equals("Mountain") && price > 50) {
            System.out.println("Outside Bulgaria - Himalayas");
        } else {
            System.out.println("there is no information about this type of vacation");
        }
*/
    }
}