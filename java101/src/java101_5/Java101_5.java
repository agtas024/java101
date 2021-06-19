package java101_5;

import java.util.Scanner;

public class Java101_5 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("r giriniz...");
        double r = k.nextDouble();
        System.out.println("Merkez açı ölçüsü giriniz...");
        double 𝛼 = k.nextDouble();
        double 𝜋 = 3.14;
        System.out.println("Dilim alanı: " + (𝜋 * (r * r) * 𝛼) / 360+" cm^2");
    }

}
