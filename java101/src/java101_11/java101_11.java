/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101_11;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class java101_11 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double sicaklik = k.nextDouble();
        if (sicaklik < -60 || sicaklik > 60) {
            System.out.println("Böyle bir sıcaklık değeri olamaz.");
            System.exit(0);
        }
        if (sicaklik < 5) {
            System.out.println("Kayak Yapabilirsiniz");
        }
        if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Sinemaya Gidebilirsiniz");
        }
        if (sicaklik >= 10 && sicaklik <= 25) {
            System.out.println("Piknik yapabilirsiniz");
        }
        if (sicaklik > 25) {
            System.out.println("Yüzebilirsiniz");
        }
    }
}
