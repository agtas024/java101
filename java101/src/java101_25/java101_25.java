/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101_25;

import java.util.Scanner;

/**
 *
 * @author Muammer Agtas
 */
public class java101_25 {
    public static void main(String[] args) {
         String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            {
                                System.out.print("Para miktarı : ");
                                int price = input.nextInt();
                                balance += price;
                                break;
                            }
                        case 2:
                            {
                                System.out.print("Para miktarı : ");
                                int price = input.nextInt();
                                if (price > balance) {
                                    System.out.println("Bakiye yetersiz.");
                                } else {
                                    balance -= price;
                                }       break;
                            }
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        default:
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
