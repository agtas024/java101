/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101_27;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class java101_27 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Kaç sayı girilecek ? : ");
        int n = k.nextInt(), sayac = 1;
        System.out.println(sayac + ". Sayıyı giriniz");
        int sayi = k.nextInt();
        int enk = sayi, enb = sayi;
        sayac++;
        while (n-1 > 0) {
            System.out.println(sayac + ". Sayıyı giriniz");
            sayi = k.nextInt();
            if (sayi > enb) {
                enb = sayi;
            } else if (sayi < enk) {
                enk = sayi;
            }
            n--;
            sayac++;
        }
        System.out.println("En küçük : " + enk);
        System.out.println("En büyük : " + enb);
    }
}
