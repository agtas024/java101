/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodlar;
import java.util.*;
/**
 *
 * @author Muammer Agtas
 */
public class palindrom_sayi {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, mod;

        while (temp != 0) {
            mod = temp % 10;
            reverseNumber = (reverseNumber * 10) + mod;
            temp /= 10;
        }
        return number == reverseNumber;
    }

    public static void main(String[] args) {
        System.out.println("Sayıyı giriniz...");
        if (isPalindrom(new Scanner(System.in).nextInt())) {
            System.out.println("Palindromdur");
        }else{
            System.out.println("Palindrom Değildir");
        }
    }
}
