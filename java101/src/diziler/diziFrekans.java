/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziler;

import java.util.Arrays;


/**
 *
 * @author Muammer Agtas
 */
public class diziFrekans {

    public static void countFreq(int dizi[], int sayi) {
        boolean durum[] = new boolean[sayi];

        Arrays.fill(durum, false);

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < sayi; i++) {

            // Skip this element if already processed
            if (durum[i] == true) {
                continue;
            }

            // Count frequency
            int sayac = 1;
            for (int j = i + 1; j < sayi; j++) {
                if (dizi[i] == dizi[j]) {
                    durum[j] = true;
                    sayac++;
                }
            }
            System.out.println(dizi[i] + " sayısı " + sayac + " kere tekrar edildi.");
        }
    }

// Driver code
    public static void main(String[] args) {
        int dizi[] = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
        int sayi = dizi.length;
        countFreq(dizi, sayi);
    }
}
