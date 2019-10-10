/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan28.gantikata;
    import java.util.Scanner;
/**
 *
 * @author Tendy
 * Nama     : Tendy Hermansyah
 * Kelas    : PBO2
 * Nim      : 10118083
 * Deskripsi Program : Ganti Kata
 */
public class PBO210118083Latihan28GantiKata {
    public static String kata, ganti, menjadi;
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("======= Program Mengganti Kata =======");
        System.out.print("Masukan Kalimat : ");
        kata = scanner.nextLine();
        System.out.print("Ganti Kata : ");
        ganti = scanner.next();
        System.out.print("Menjadi Kata : ");
        menjadi = scanner.next();
        System.out.println("===== Hasil Formatting =====");
        System.out.println("Kalimat Awal : " + kata );
        System.out.println("Kalimat Baru : " + kata.replace(ganti, menjadi));
    }
}
