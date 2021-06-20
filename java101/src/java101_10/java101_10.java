/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101_10;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class java101_10 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sayac = 0;
        System.out.print("matematik ? :");
        int m = k.nextInt();
        if (m >= 0 && m <= 100) {
            sayac++;
        } else {
            m = 0;
        }
        System.out.print("fizik ? :");
        int f = k.nextInt();
        if (f >= 0 && f <= 100) {
            sayac++;
        } else {
            f = 0;
        }
        System.out.print("türkçe ? :");
        int t = k.nextInt();
        if (t >= 0 && t <= 100) {
            sayac++;
        } else {
            t = 0;
        }
        System.out.print("kimya ? :");
        int kmy = k.nextInt();
        if (kmy >= 0 && kmy <= 100) {
            sayac++;
        } else {
            kmy = 0;
        }
        System.out.print("müzik ? :");
        int mzk = k.nextInt();
        if (mzk >= 0 && mzk <= 100) {
            sayac++;
        } else {
            mzk = 0;
        }
        double ort = m + f + t + kmy + mzk;
        ort /= sayac;
        if (ort <= 55) {
            System.out.println("kaldınız");
        } else {
            System.out.println("geçtiniz");
        }
    }
}
