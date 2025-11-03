package LatUKL031125;

import java.util.Scanner;

public class S6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Baris matriks: ");
        int baris = in.nextInt();
        System.out.println("Kolom matriks: ");
        int kolom = in.nextInt();

        double[][] m1 = new double[baris][kolom];
        System.out.println("Masukkan elemen matriks pertama: ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                m1[i][j] = in.nextDouble();
            }
        }

        double[][] m2 = new double[baris][kolom];
        System.out.println("Masukkan elemen matriks kedua: ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                m2[i][j] = in.nextDouble();
            }
        }
        double[][] hasil = new double[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = m1[i][j] + m2[i][j];
            }
        }
        System.out.println("Hasil:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + " ");
            }
        }
        in.close();
    }
}