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
public class transpoz {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("matris sütunu: ");
        int sutun = k.nextInt();
        System.out.print("matris satırı: ");
        int satir = k.nextInt();
        System.out.println("Sırayla değerleri giriniz /satır satır şeklinde/");
        int[][] dizi = new int[satir][sutun];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                dizi[i][j] = k.nextInt();

            }
        }
        System.out.println("Matris:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(dizi[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpoz");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(dizi[j][i]+" ");
            }
            System.out.println();
        }
    }
}
