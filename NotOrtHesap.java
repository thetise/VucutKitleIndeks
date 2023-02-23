package Giris;

import java.util.Scanner;

public class NotOrtHesap {
    public static void main(String[] args){

        double math1, math2;
        double  mathresult;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a math1 and math2 points: ");

        math1 = input.nextDouble();
        math2 = input.nextDouble();

        mathresult = (math1 + math2) / 2;

        double phys1, phys2;
        double  physresult;
        Scanner inputt = new Scanner(System.in);
        System.out.print("Enter a phys1 and phys2 points: ");

        phys1 = inputt.nextDouble();
        phys2 = inputt.nextDouble();

        physresult = (phys1 + phys2) / 2;

        double ceac1, ceac2;
        double  ceacresult;
        Scanner inputtt = new Scanner(System.in);
        System.out.print("Enter a ceac1 and ceac2 points: ");

        ceac1 = inputtt.nextDouble();
        ceac2 = inputtt.nextDouble();

        ceacresult = (ceac1 + ceac2) / 2;

        System.out.print("Your math result is: ");
        System.out.println(mathresult);

        System.out.print("Your phys result is: ");
        System.out.println(physresult);

        System.out.print("Your ceac result is: ");
        System.out.println(ceacresult);;

        double sum;

        sum = (mathresult + ceacresult + physresult) / 3;

        double kosul = 60;
        boolean sonuc = (sum >= kosul);

        String str  = sonuc ? ("Pass Class") : ("Fail Class");

        System.out.print("Your GPA is: ");
        System.out.println(sum);
        System.out.println(str);
    }
}
