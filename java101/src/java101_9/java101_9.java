/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101_9;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class java101_9 {

    public static void main(String[] args) {
        String kad = "agtas024";
        String sifre = "123abc.";
        Scanner k = new Scanner(System.in);
        System.out.print("Ad ? : ");
        String a = k.nextLine();
        System.out.print("Şifre ? : ");
        String s = k.next();
        if (!kad.equals(a)) {
            System.out.println("Şifre Sıfırlayacak mısınız? (Y/N)");
            String karar = k.next();
            if (karar.equalsIgnoreCase("Y")) {
                System.out.println("Yeni şifre giriniz...");
                for (;;) {
                    String newsifre = k.next();
                    if (sifre.equals(newsifre)) {
                        System.out.println("Şifre oluşturulamadı,lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu");
                        sifre = newsifre;
                        break;
                    }
                }
            } else if (karar.equalsIgnoreCase("N")) {
                System.out.println("Şifre oluşturmadınız!");
            }
        } else {
            if (!sifre.equals(s)) {
                System.out.println("Şifreniz hatalı");
            } else {
                System.out.println("İşlem başarılı");
            }
        }
    }
}
