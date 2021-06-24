/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodlar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class Motif {

    static public void desen(int N) {
        String s = Integer.toString(N) + " ";
        for (;;) {
            if (N <= 0) {
                break;
            }
            N -= 5;
            s += Integer.toString(N) + " ";
        }
        String[] str = s.split(" ");
        for (String str1 : str) {
            System.out.print(str1 + " ");
        }
        for (int i = str.length - 2; i >= 0; i--) {
            System.out.print(str[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner K = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz : ");
        int N = K.nextInt();
        desen(N);

    }
}
