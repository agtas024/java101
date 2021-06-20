/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101_30;

/**
 *
 * @author Muammer Agtas
 */
public class java101_30 {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i != 1 && i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i % 11 != 0) {
                System.out.print(i + " ");
            } else if (i == 2 || i == 3 || i == 5 || i == 7 || i == 11) {
                System.out.print(i + " ");
            }
        }
    }
}
