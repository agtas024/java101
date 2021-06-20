/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101_28;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class java101_28 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int toplam = 0;

        System.out.print("Bir sayi giriniz: ");
        int sayi = k.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (sayi == toplam) {
            System.out.println(sayi + " Mükemmel sayıdır");
        } else {
            System.out.println(sayi + " Mükemmel sayı degildir.");
        }
    }
}
