package Giris;

import java.util.Scanner;
public class VucutKitleIndeks {
    public static void main(String[] args) {

        double Kilo, Boy, VucutKitleIndex;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        Scanner input = new Scanner(System.in);
        Boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        Scanner inputt = new Scanner(System.in);
        Kilo = inputt.nextDouble();

        VucutKitleIndex = Kilo / (Boy * Boy);

        System.out.print("Vücut Kitle İndeksiniz: ");
        System.out.print(VucutKitleIndex);
    }
}
