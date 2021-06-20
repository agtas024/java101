/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101_16;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class java101_16 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Yılınızı Giriniz : ");
        int date = k.nextInt();
        if (date % 4 == 0) {
            if (date % 100 == 0) {
                if (date % 400 == 0) {
                    System.out.println(date + " bir artık yıldır !");
                } else {
                    System.out.println(date + " bir artık yıldır değildir !");
                }
            } else {
                System.out.println(date + " bir artık yıldır !");
            }
        }else{
            System.out.println(date + " bir artık yıldır değildir !");
        }
    }
}
