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
public class fibonacci {

        public static int fib(int n) {
            if (n == 0) {
                return 0;
            }
            if (n == 1 || n == 2) {
                return 1;
            }
            return fib(n - 2) + fib(n - 1);
        }

        public static void main(String args[]) {
            System.out.println("Seri Adeti  Giriniz...");
            int n = new Scanner(System.in).nextInt();
            for (int i = 0; i <= n; i++) {
                System.out.print(fib(i) + " ");
            }
        }
    }
