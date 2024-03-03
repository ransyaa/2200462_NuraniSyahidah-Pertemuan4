/*
Nurani Syahidah 2200462
Pendidikan Ilmu Komputer

SOAL 2 GENAP

Buatlah algoritma dalam bahasa Java, menampilkan jumlah deret 
bilangan genap dari batasAwal dan batasAkhir yang diinput dari alat masukan.
 */
package pboperulangan4agenap;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai batasAwal
        System.out.print("Masukkan nilai batasAwal: ");
        int batasAwal = scanner.nextInt();

        // Meminta pengguna untuk memasukkan nilai batasAkhir
        System.out.print("Masukkan nilai batasAkhir: ");
        int batasAkhir = scanner.nextInt();

        // Menutup objek Scanner setelah pengguna memasukkan nilai
        scanner.close();

        // Menampilkan jumlah deret bilangan genap dari batasAwal hingga batasAkhir
        int jumlahGenap = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                jumlahGenap += i;
            }
        }

        System.out.println("Jumlah deret bilangan genap: " + jumlahGenap);
    }
}
