package homework.classHomework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Trissturis Create_triangle_1 = new Trissturis();
        System.out.print("Enter first length: ");
        Create_triangle_1.firstSide = scan.nextInt();
        System.out.print("Enter second length: ");
        Create_triangle_1.secondSide = scan.nextInt();
        System.out.print("Enter third length: ");
        Create_triangle_1.thirdSide = scan.nextInt();

        Trissturis Create_triangle_2 = new Trissturis(Create_triangle_1.firstSide, Create_triangle_1.secondSide, Create_triangle_1.thirdSide);

        System.out.println("Triangle area is " + Create_triangle_2.Triangle_Area);

        if (Create_triangle_1.Equilateral()) {
            System.out.print("Triangle is Equilateral.");
        } else {
            System.out.println("Triangle is not Equilateral");
        }

        if (Create_triangle_1.Isosceles()) {
            System.out.println("Triangle is Isosceles.");
        } else {
            System.out.println("Triangle is not Isosceles.");
        }

    }
}


