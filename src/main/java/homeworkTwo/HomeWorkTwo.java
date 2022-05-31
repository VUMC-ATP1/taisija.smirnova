package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        ///a
        int x = 10;
        System.out.println(x > 0);
        ///b
        int d = -7;
        System.out.println(d < -9);
        ///c
        int t = 10;
        boolean result = t > 5 && t <= 10;
        System.out.println(result);
        ///d
        int m = 7;
        boolean result1 = m > 5 && m < 10;
        System.out.println(result1);
        ///e
        int n = 4;
        boolean result2 = n == 0 || n == 10;
        System.out.println(result2);

        ///f
        int z = 10;
        int f = x * x;
        boolean result3 = f > 10;
        System.out.println(result3);

        ///2

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month number");
        int monthNumber = scanner.nextInt();
        switch (monthNumber) {
            case 1:
                System.out.printf("January");
                break;
            case 2:
                System.out.printf("February");
                break;
            case 3:
                System.out.printf("March");
                break;
            case 4:
                System.out.printf("April");
                break;
            case 5:
                System.out.printf("May");
                break;
            case 6:
                System.out.printf("June");
                break;
            case 7:
                System.out.printf("July");
                break;
            case 8:
                System.out.printf("August");
                break;
            case 9:
                System.out.printf("September");
                break;
            case 10:
                System.out.printf("October");
                break;
            case 11:
                System.out.printf("November");
                break;
            case 12:
                System.out.printf("December");


                ///3

                System.out.println("Enter 1 number");
                int number1 = scanner.nextInt();
                System.out.println("Enter 2 number");
                int number2 = scanner.nextInt();
                System.out.println("Enter 3 number");
                int number3 = scanner.nextInt();
                System.out.println(Math.max(Math.max(number1, number2), number3));

                ///4

                System.out.println("Ievadiet luksafora krasu");
                String krasa = scanner.next();
                if (krasa.equalsIgnoreCase("sarkana")) {
                    System.out.println("Nedrikst iet");
                } else if (krasa.equalsIgnoreCase("dzeltena")) {
                    System.out.println("Gaidi");
                } else if (krasa.equalsIgnoreCase("zala")) {
                    System.out.println("Var iet");

                }
        }
    }

}
