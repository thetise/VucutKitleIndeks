package Giris;

import java.util.Scanner;

public class UcgenAlanHesap {
    public static void main(String[] args) {

        double kenar1, kenar2, kenar3, u, m, alan;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side lengths of the triangle: ");

        kenar1 = input.nextDouble();
        kenar2 = input.nextDouble();
        kenar3 = input.nextDouble();

        u = (kenar1 + kenar2 + kenar3) / 2;
        m = u * (u - kenar1) * (u - kenar2) * (u - kenar3);
        alan = Math.sqrt(m);

        System.out.print("Area of triangle: ");
        System.out.print(alan);
    }
}
