/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziler;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class sıralıdizi {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Dizi boyutu nedir : ");
        int boyut = k.nextInt();
        int d[] = new int[boyut];
        for (int i = 0; i < boyut; i++) {
            System.out.print(i + 1 + ". eleman : ");
            d[i] = k.nextInt();
        }
        int temp = 0;

        for (int i = 0; i < d.length; i++) {
            for (int j = 1; j < (d.length - i); j++) {

                if (d[j - 1] > d[j]) {
                    //elemanları yerdeğiştiriyoruz.
                    temp = d[j - 1];
                    d[j - 1] = d[j];
                    d[j] = temp;
                }

            }
        }
        for(int i =0;i<d.length;i++){
            System.out.println(d[i]);
        }
    }
}
