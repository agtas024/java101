/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101_26;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class java101_26 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("İlk sayı : ");
        int n1 = k.nextInt();
        System.out.print("İkinci sayı : ");
        int n2 = k.nextInt();
        int i, EBOB = 1;
        if (n1 > n2) {
            i = n2;
        } else {
            i = n1;
        }
        while (i > 0) {
            if (n1 % i == 0 && n2 % i == 0) {
                EBOB = i;
                break;
            }
            i--;
        }
        int EKOK = (n1 * n2) / EBOB;
        System.out.println("EBOB : " + EBOB);
        System.out.println("EKOK : " + EKOK);
    }
}
