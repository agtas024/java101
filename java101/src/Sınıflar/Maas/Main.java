/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sınıflar.Maas;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class Main {

    static Employee E;

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.print("İsim Giriniz : ");
        String ad = k.nextLine();
        System.out.print("Maaş Miktarı Giriniz : ");
        double maas = k.nextDouble();
        System.out.print("Çalışma Saati Giriniz : ");
        int saat = k.nextInt();
        System.out.print("Maaş Miktarı Giriniz : ");
        int yil = k.nextInt();
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();
        Employee E = new Employee(ad, maas, saat, yil);
        String toString = E.toString();
        System.out.println(toString);

    }
}
