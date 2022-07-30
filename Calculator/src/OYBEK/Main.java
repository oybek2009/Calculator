package OYBEK;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        // JAVAda calculator yaratish

        Scanner scanner = new Scanner(in);

        System.out.print("Birinchi sonni kiriting: ");
        double num1 = scanner.nextInt();

        scanner = new Scanner(in);
        System.out.print("Ishorani kiriting: ");
        String str = scanner.nextLine();

        System.out.print("Ikkinchi sonni kiriting: ");
        double num2 = scanner.nextDouble();

        switch (str) {
            case "+" -> {
                System.out.println(num1 + num2);
            }
            case "-" -> {
                System.out.println(num1 - num2);
            }
            case "*" -> {
                System.out.println(num1 * num2);
            }
            case "/" -> {
                System.out.println(num1 / num2);
            }
        }
    }
}
