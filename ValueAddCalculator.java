package PatikaOdevlerVePratikler;

import java.util.Scanner;

public class ValueAddCalculator {
    public static void main(String[] args) {
        double tutar, kdvOrani1 = 0.18, kdvOrani2 = 0.08, kdvliUcret, kdvliUcret1, kdvliUcret2;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Tutar Giriniz:");
        tutar = input.nextDouble();

        kdvliUcret = (tutar >= 1000) ? 1 : 0;
        kdvliUcret1 = (tutar * kdvOrani2) + tutar;
        kdvliUcret2 = (tutar * kdvOrani1) + tutar;


        System.out.println((kdvliUcret == 1) ? kdvliUcret1 : kdvliUcret2 );

    }
}


//Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.