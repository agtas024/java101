/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101_31;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class java101_31 {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Seri Sayısı Giriniz : ");
        int n = klavye.nextInt();
        int a = 1, b = 2, c;
        System.out.println("0 + 1 = " + a);
        System.out.println("1 + 1 = " + b);
        for (int i = 0; i < n - 2; i++) {
            c = a + b;
            System.out.println(a + " + " + b + " = " + c);
            a = b;
            b = c;
        }
    }
}
