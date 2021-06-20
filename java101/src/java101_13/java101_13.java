/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101_13;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class java101_13 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Doğum tarihinizi 11/08/1998 şeklinde giriniz...");
        String dt = k.next();
        String d[] = dt.split("/");

        if (d[1].equals("01")) {
            if (Integer.parseInt(d[0]) >= 22) {
                System.out.println("Kova Burcu");
            } else {
                System.out.println("Oğlak Burcu");
            }
        } else if (d[1].equals("02")) {
            if (Integer.parseInt(d[0]) >= 20) {
                System.out.println("Balık Burcu");
            } else {
                System.out.println("Kova Burcu");
            }
        } else if (d[1].equals("03")) {
            if (Integer.parseInt(d[0]) >= 21) {
                System.out.println("Koç Burcu");
            } else {
                System.out.println("Balık Burcu");
            }
        } else if (d[1].equals("04")) {
            if (Integer.parseInt(d[0]) >= 21) {
                System.out.println("Boğa Burcu");
            } else {
                System.out.println("Koç Burcu");
            }
        } else if (d[1].equals("05")) {
            if (Integer.parseInt(d[0]) >= 22) {
                System.out.println("İkizler Burcu");
            } else {
                System.out.println("Boğa Burcu");
            }
        } else if (d[1].equals("06")) {
            if (Integer.parseInt(d[0]) >= 23) {
                System.out.println("Yengeç Burcu");
            } else {
                System.out.println("İkizler Burcu");
            }
        } else if (d[1].equals("07")) {
            if (Integer.parseInt(d[0]) >= 23) {
                System.out.println("Aslan Burcu");
            } else {
                System.out.println("Yengeç Burcu");
            }
        } else if (d[1].equals("08")) {
            if (Integer.parseInt(d[0]) >= 23) {
                System.out.println("Başak Burcu");
            } else {
                System.out.println("Aslan Burcu");
            }
        } else if (d[1].equals("09")) {
            if (Integer.parseInt(d[0]) >= 23) {
                System.out.println("Terazi Burcu");
            } else {
                System.out.println("Başak Burcu");
            }
        } else if (d[1].equals("10")) {
            if (Integer.parseInt(d[0]) >= 23) {
                System.out.println("Akrep Burcu");
            } else {
                System.out.println("Terazi Burcu");
            }
        } else if (d[1].equals("11")) {
            if (Integer.parseInt(d[0]) >= 22) {
                System.out.println("Yay Burcu");
            } else {
                System.out.println("Akrep Burcu");
            }
        } else if (d[1].equals("12")) {
            if (Integer.parseInt(d[0]) >= 22) {
                System.out.println("Oğlak Burcu");
            } else {
                System.out.println("Yay Burcu");
            }
        }
    }
}
