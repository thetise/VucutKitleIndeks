package Giris;

import java.util.Scanner;
public class KdvHesap {
    public static void main(String[] args) {

        double KDVAfter, price, KDVPriceCheap, KDVPriceExpensive, KDVAfterCheap, KDVAfterExpensive;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter without KDV price: ");

        price = input.nextDouble();

        KDVPriceCheap = (price * 18) / 100;
        KDVAfterCheap = price + KDVPriceCheap;

        KDVPriceExpensive = (price * 8) / 100;
        KDVAfterExpensive = price + KDVPriceExpensive;

        double kosul = 1000;
        boolean sonuc = (price >= 1000);
        double str = sonuc ? (KDVAfterExpensive) : (KDVAfterCheap);
        System.out.print("KDV's Price: ");
        System.out.println(str);

        double kosul2 = 1000;
        boolean sum = (price >= 1000);
        double strr = sum ? (KDVPriceExpensive) : (KDVPriceCheap);
        System.out.print("KDV: ");
        System.out.println(strr);
    }
}
