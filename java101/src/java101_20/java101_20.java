/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101_20;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class java101_20 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("n giriniz : ");
        int n = k.nextInt();
        System.out.println("r giriniz : ");
        int r = k.nextInt();
        int fakN = 1, fakR = 1, fakn_r = 1;
        for (int i = 1; i <= n; i++) {
            fakN = fakN * i;
        }
        for (int i = 1; i <= r; i++) {
            fakR = fakR * i;
        }
        for (int i = 1; i <= (n - r); i++) {
            fakn_r = fakn_r * i;
        }
        double Cnr = fakN / (fakR * fakn_r);
        System.out.println("C(n,r): " + Cnr);
    }
}
