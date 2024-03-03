/*
Nurani Syahidah 2200462
Pendidikan Ilmu Komputer

SOAL 3 GENAP
Buatlah algoritma dalam bahasa Java, menghitung Pembagi Bersama 
Terbesar dari dua buah bilangan a dan b yang diinput dari alat masuk 
 */
package pboperulangan4agenap;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai a
        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();

        // Meminta pengguna untuk memasukkan nilai b
        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();

        // Menutup objek Scanner setelah pengguna memasukkan nilai
        scanner.close();

        // Menghitung Pembagi Bersama Terbesar (GCD) dengan Algoritma Euclidean
        int gcd = hitungGCD(a, b);

        // Menampilkan hasil
        System.out.println("Pembagi Bersama Terbesar dari " + a + " dan " + b + " adalah: " + gcd);
    }

    // Metode untuk menghitung Pembagi Bersama Terbesar (GCD) dengan Algoritma Euclidean
    public static int hitungGCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
