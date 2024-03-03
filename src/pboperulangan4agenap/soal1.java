/*
Nurani Syahidah 2200462
Pendidikan Ilmu Komputer

SOAL 1 GENAP
Buatlah algoritma dalam bahasa Java, mengulang menuliskan teks “Saya
senang belajar bahasa Java” sebanyak N kali, dengan nilai N yang akan 
dibaca dengan perintah inputan menggunakan perulangan for.
 */
package pboperulangan4agenap;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai N
        System.out.print("Masukkan nilai N: ");

        // Menggunakan if-else untuk menangani input yang tidak valid
        if (scanner.hasNextInt()) {
            int N = scanner.nextInt();

            // Melakukan perulangan for untuk menuliskan teks sebanyak N kali
            for (int i = 0; i < N; i++) {
                System.out.println("Saya senang belajar bahasa Java");
            }
        } else {
            System.out.println("Input yang dimasukkan harus berupa bilangan bulat.");
        }

        // Menutup objek Scanner setelah pengguna memasukkan nilai atau terjadi exception
        scanner.close();
    }
}

