/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101_21;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class java101_21 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int s = 1;
        System.out.println("sayı giriniz : ");
        int n = k.nextInt();
        System.out.println("üs giriniz : ");
        int m = k.nextInt();
        for (int i = 0; i < m; i++) {
            s *= n;
        }
        System.out.println("Sonuc = " + s);
    }
}
