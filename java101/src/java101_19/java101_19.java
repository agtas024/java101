/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101_19;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class java101_19 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Üs giriniz : ");
        int x = k.nextInt(),us4=4,us5=5;
        for (int i = 1; i < x; i++) {
            us4*=4;
            us5*=5;
        }
        System.out.println("4^"+x+" değeri : "+us4);
        System.out.println("5^"+x+" değeri : "+us5);
    }
}
