/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class maxmin {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int sayi = k.nextInt();
        int[] dizi = {15,12,788,1,-1,-778,2,0};
        List<Integer> listmin = new ArrayList<>();
        List<Integer> listmax = new ArrayList<>();

        int min = dizi[0];
        int max = dizi[0];

        for (int i : dizi) {
            if (i < sayi) {
                listmin.add(i);
            }
            if (i > sayi) {
                listmax.add(i);
            }
        }
        Collections.sort(listmin);
        Collections.sort(listmax);
        max = listmax.get(0);
        min = listmin.get(listmin.size() - 1);

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

    }
}
