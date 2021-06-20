/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodlar;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class asalmı {

    public static void main(String[] args) {
        int num, prime;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pozitif bir sayi giriniz : ");
        num = scanner.nextInt();

        prime = asl(num, num / 2);

        if (prime == 1) {
            System.out.println(num + " sayisi asaldir !");
        } else {
            System.out.println(num + " sayisi asal değildir !");
        }
    }

    private static int asl(int num, int i) {
        if (i == 1) {
            return 1;
        } else {
            if (num % i == 0) {
                return 0;
            } else {
                return asl(num, i - 1);
            }
        }
    }
}
