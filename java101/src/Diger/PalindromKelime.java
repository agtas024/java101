/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diger;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class PalindromKelime {

    static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return str.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner K = new Scanner(System.in);
        System.out.print("Kelimeyi Giriniz : ");
        String s = K.nextLine();
        if (PalindromKelime.isPalindrome(s)) {
            System.out.println("Kelime Palindromdur.");
        } else if (!PalindromKelime.isPalindrome(s)) {
            System.out.println("Kelime Palindrom Değildir.");
        }
    }
}
