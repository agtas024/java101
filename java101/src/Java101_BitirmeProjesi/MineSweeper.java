package Java101_BitirmeProjesi;

import java.util.ArrayList;
import java.util.Scanner;

public class MineSweeper {

    public MineSweeper() {
    }

    static int satir, sutun;
    static ArrayList<Integer> mayinTutucu;
    static int[][] tarla1;
    static String[][] tarla2;
    static int sayac, kontrol;

    public MineSweeper(int satir, int sutun) {
        MineSweeper.satir = satir;
        MineSweeper.sutun = sutun;
        mayinTutucu = new ArrayList();
        tarla1 = new int[satir][sutun];
        tarla2 = new String[satir][sutun];
        sayac = 0;
    }

    public void mayınAtama() {
        int sayacc = 0;
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                tarla2[i][j] = "-";
                tarla1[i][j] = sayacc;
                sayacc++;
            }
        }
        int cont = -1;
        for (int i = 0; i < (int) (satir * sutun) / 4;) {
            int r = (int) (Math.random() * (satir * sutun));
            if (cont != r) {
                cont = r;
                mayinTutucu.add(r);
                i++;
            }
        }
    }

    public void Nerede() {

        boolean kır;
        for (int i = 0; i < mayinTutucu.size(); i++) {
            for (int j = 0; j < satir; j++) {
                kır = false;
                for (int k = 0; k < sutun; k++) {
                    if (mayinTutucu.get(i) == tarla1[j][k]) {
                        tarla2[j][k] = "*";
                        kır = true;
                        break;
                    }
                }
                if (kır) {
                    break;
                }
            }
        }
    }

    public void komsuMayinSay(int satir, int sutun) {
        sayac = 0;

        if (mayinTutucu.contains(tarla1[satir][sutun])) {
            System.out.println("Game Over!!");
            System.exit(0);
        }
        if (tarla1[satir][sutun] - MineSweeper.sutun - 1 >= 0 && (tarla1[satir][sutun] - MineSweeper.sutun - 1) % MineSweeper.sutun == 0) {
            if (mayinTutucu.contains(tarla1[satir][sutun] - MineSweeper.sutun - 1)) {
                sayac++;
            }

        }
        if (tarla1[satir][sutun] - MineSweeper.sutun >= 0) {
            if (mayinTutucu.contains(tarla1[satir][sutun] - MineSweeper.sutun)) {
                sayac++;
            }

        }
        if (tarla1[satir][sutun] - MineSweeper.sutun + 1 >= 0 && (tarla1[satir][sutun] - MineSweeper.sutun + 1) % MineSweeper.sutun != 0) {
            if (mayinTutucu.contains(tarla1[satir][sutun] - MineSweeper.sutun + 1)) {
                sayac++;
            }
        }
        if (tarla1[satir][sutun] - 1 >= 0 && (tarla1[satir][sutun] - 1) % MineSweeper.sutun == 0) {
            if (mayinTutucu.contains(tarla1[satir][sutun] - 1)) {
                sayac++;
            }
        }
        if (tarla1[satir][sutun] + 1 >= 0 && (tarla1[satir][sutun] + 1) % MineSweeper.sutun != 0) {
            if (mayinTutucu.contains(tarla1[satir][sutun] + 1)) {
                sayac++;
            }
        }
        if (tarla1[satir][sutun] + MineSweeper.sutun - 1 >= 0 && (tarla1[satir][sutun] + MineSweeper.sutun - 1) % MineSweeper.sutun == 0) {
            if (mayinTutucu.contains(tarla1[satir][sutun] + MineSweeper.sutun - 1)) {
                sayac++;
            }
        }
        if (tarla1[satir][sutun] + MineSweeper.sutun >= 0) {
            if (mayinTutucu.contains(tarla1[satir][sutun] + MineSweeper.sutun)) {
                sayac++;
            }
        }
        if (tarla1[satir][sutun] + MineSweeper.sutun + 1 >= 0 && (tarla1[satir][sutun] + MineSweeper.sutun + 1) % MineSweeper.sutun != 0) {
            if (mayinTutucu.contains(tarla1[satir][sutun] + MineSweeper.sutun + 1)) {
                sayac++;
            }
        }
        tarla2[satir][sutun] = Integer.toString(sayac);
        sayac = 0;
        if ((MineSweeper.satir * MineSweeper.sutun) - ((MineSweeper.satir * MineSweeper.sutun) / 4) == kontrol) {
            System.out.println("Oyunu Kazandınız !");
            for (int i = 0; i < MineSweeper.satir; i++) {
                for (int j = 0; j < MineSweeper.sutun; j++) {
                    System.out.print(tarla2[i][j] + " ");
                    tarla2[i][j] = "-";
                }
                System.out.println();
            }
            System.out.println("===========================");
            System.exit(0);
        }
    }

    public void OyunStart() {
        kontrol = 0;
        Scanner k = new Scanner(System.in);
        int s1 = 0, s2 = 0;
        for (;;) {
            System.out.print("Satır Sayısı Giriniz : ");
            s1 = k.nextInt();
            System.out.print("Sütun Sayısı Giriniz : ");
            s2 = k.nextInt();
            if (s1 < 2 || s2 < 2) {
                System.out.println("Matrisiniz Minimum 2x2 Boyutlarda Olmalıdır...");
            } else {
                break;
            }
        }
        MineSweeper mineSweeper = new MineSweeper(s1, s2);
        mineSweeper.mayınAtama();
        System.out.println("Mayınların Konumu");
        mineSweeper.Nerede();
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(tarla2[i][j] + " ");
                tarla2[i][j] = "-";
            }
            System.out.println();
        }
        System.out.println("===========================");
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        for (int d = 0; d < MineSweeper.satir * MineSweeper.sutun;) {
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    System.out.print(tarla2[i][j] + " ");
                }
                System.out.println();
            }
            System.out.print("Satır Giriniz : ");
            int sat = k.nextInt();
            System.out.print("Sütun Giriniz : ");
            int sut = k.nextInt();
            if (sat >= MineSweeper.satir || sut >= MineSweeper.sutun || sat < 0 || sut < 0) {
                System.out.println("Geçerli Değerler Giriniz...");
                continue;
            }
            d++;
            kontrol++;
            mineSweeper.komsuMayinSay(sat, sut);
            System.out.println("===========================");
        }
    }

    public static void main(String[] args) {
        MineSweeper m = new MineSweeper();
        m.OyunStart();
    }
}
