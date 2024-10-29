package Perulangan;

import java.util.Scanner;

public class perulanganFor {
    public static void main(String[] args) {
        int NilaiAwal, NilaiAkhir;
        Scanner s = new Scanner(System.in);
        System.out.println("Masukan Nilai Awal");
        NilaiAwal = s.nextInt();
        System.out.println("Masukan Nilai Akhir");
        NilaiAkhir = s.nextInt();
        for (int angka = NilaiAwal; angka <=NilaiAkhir; angka+=2){
            System.out.println(angka);
        }
    }
}
