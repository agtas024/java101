/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodlar;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class us {

    public int usal(int sayi, int ussu) {
       
        if (ussu == 0) {
            return 1;
        }
        if (ussu == 1) {
            return sayi;
        } else {
            return sayi * usal(sayi, ussu - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Önce taban Sonra üs giriniz...");
        int sonuc = new us().usal(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt());
        System.out.println("Sonuç : " + sonuc);
    }
}
