package Perulangan;

import java.util.Scanner;

public class PengulanganNilai {
      public static void main(String[] args) {
        int JumlahSiswa;
        double rata, Nilai, TotalNilai=0;
        Scanner s = new Scanner(System.in);

        System.out.println("Masukan Jumlah siswa");
        JumlahSiswa = s.nextInt();
         
        for (int i = 1; i <=JumlahSiswa; i++){
            System.out.println("Nilai siswa" + i + ":");
            Nilai = s.nextDouble();
            TotalNilai = TotalNilai = Nilai;
          
        }

        rata = TotalNilai/JumlahSiswa;
        System.out.println("Total Nilai: "+TotalNilai);
        System.out.println("Rata-Rata Nilai: " + rata );

        s.close();
    }
}
