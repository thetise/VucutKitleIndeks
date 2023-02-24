package Giris;

import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {

        double pi, alan, radius, alfa;

        pi = 3.14;

        Scanner inputt = new Scanner(System.in);
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz: ");
        alfa = inputt.nextDouble();

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        radius = input.nextDouble();

        alan = (pi * ( radius * radius) * alfa)/360;

        System.out.print("Alan: ");
        System.out.println(alan);
    }
}
