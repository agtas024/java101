/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101_14;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class java101_14 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("KM cinsinden mesafe giriniz... : ");
        int mesafe = k.nextInt();
        if (mesafe <= 0) {
            System.out.println("Mesafe - olamaz... Hatalı Veri Girdiniz !");
            System.exit(0);
        }
        System.out.print("Yaş giriniz... : ");
        int yas = k.nextInt();
        if (yas <= 0) {
            System.out.println("Yaş - olamaz... Hatalı Veri Girdiniz !");
            System.exit(0);
        }
        System.out.print("1-gidiş/dönüş\n2-tek yön : ");
        int yon = k.nextInt();
        if (yon != 1 && yon != 2) {
            System.out.println("Yön bilgisi hatalı... Hatalı Veri Girdiniz !");
            System.exit(0);
        }
        double ucret = 0;
        for (int i = 0; i < mesafe; i++) {
            ucret += 0.10;
        }
        if (yas < 12) {
            ucret /= 2;
        } else if (yas >= 12 && yas <= 24) {
            ucret -= ucret / 10;
        } else if (yas > 65) {
            ucret -= ucret * 3 / 10;
        }
        if (yon == 1) {
            ucret -= ucret / 5;
        }
        System.out.println("Ücretiniz : " + ucret + " tl");
    }
}
