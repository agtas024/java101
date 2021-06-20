/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101_15;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class java101_15 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        int dt = k.nextInt();
        dt %= 12;
        String ay = "";
        switch (dt) {
            case 0:
                ay = "maymun";
                break;
            case 1:
                ay = "horoz";
                break;
            case 2:
                ay = "köpek";
                break;
            case 3:
                ay = "domuz";
                break;
            case 4:
                ay = "fare";
                break;
            case 5:
                ay = "öküz";
                break;
            case 6:
                ay = "kaplan";
                break;
            case 7:
                ay = "tavşan";
                break;
            case 8:
                ay = "ejderha";
                break;
            case 9:
                ay = "yılan";
                break;
            case 10:
                ay = "at";
                break;
            case 11:
                ay = "koyun";
                break;
        }
        System.out.println("Çin Zodyağı Burcunuz : " + ay);
    }
}
