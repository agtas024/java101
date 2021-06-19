package java101_3;

import java.util.Scanner;

public class Java101_3 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Sırsıyla üçgenin kenarlarını giriniz...");
        int a = k.nextInt();
        int b = k.nextInt();
        int c = k.nextInt();
        double u = (a + b + c) / 2;
        u = u*(u-a)*(u-b)*(u-c);
        u = Math.sqrt(u);
        System.out.println("Alan: "+u);
        
    }

}
