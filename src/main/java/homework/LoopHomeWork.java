package homework;

import java.util.Random;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        ///1
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int number;
        int sum = 0;
        while (sum < 100) {
            System.out.println("Ieraksti ludzu veselu skaitli");
            number = scanner.nextInt();
            sum = sum + number;
        }
        System.out.println("Gatavs");

        ///2
        Scanner input = new Scanner(System.in);
        System.out.println("Ievadiet skaitli");
        int num = input.nextInt();
        boolean isPrime = true;
        for (int p = 6; p <= num / 6; ++p) {
            if (num % p == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num + "ja, ir pirmskaitlis");
        else
            System.out.println(num + "ne, nav pirmskaitlis");


        ///6

        int guesses = 3;
        Random random = new Random();
        int pinCode = (int) (Math.random() * 1 + 4321);
        System.out.println("Pincode : " + pinCode);
        boolean isGuessed = false;

        while (!isGuessed) {
            System.out.println("Ievadiet savu pin kodu! Jums ir: " + guesses + "meginajumi");
            int answer = scanner.nextInt();
            if (answer == pinCode) {
                System.out.println("pin der, welcome");
                isGuessed = true;
            } else {
                guesses--;
                System.out.println("Nepareizs pin,velreiz");
                if (guesses == 0) {
                    System.out.println("Blokets");
                    break;
                }
            }

            ///5

            System.out.println("Ievadiet skaitli : ");
            Scanner input2 = new Scanner(System.in);
            int num1 = input2.nextInt();
            int d = 2;
            int fct = 2;
            for (d = 2; d <= num1; d++) {
                fct = fct * d;
            }
            System.out.println("Faktorialais ir  " + num1 + " ir " + fct);

        }
        ///
        System.out.println("Ievadiet skaitli: ");
        int f = scanner.nextInt();
        int fct = 1;
        for (int t = 1; t <= f; t++) {
            fct = fct * t;
        }
        System.out.printf("Faktorialis ir: %d", fct);
    }
}












