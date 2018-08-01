/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class DataSiswa {
    public static void main(String[] args){
        //Deklarasi variabel
        String nama, alamat;
        int usia, absen;
        //membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        //Tampilkan output ke user
        System.out.println("### DATA SISWA SMK TELKOM MALANG###");
        System.out.print("Nama Siswa: ");
        //menggunakan scanner dan menyimpan apamyang diketik di variabel nama
        nama = keyboard.next();
        //tampilkan output lagi
        System.out.print("alamat: ");
        //menggunkan scanner lagi
        alamat = keyboard.next();
        System.out.print("absen: ");
        usia = keyboard.nextInt();
        System.out.print("Usia: ");
        absen = keyboard.nextInt();
        //menampilkan apa yang sudah disimpan di variabel
        System.out.println("------------------------");
        System.out.println("Nama Siswa: " + nama);
        System.out.println("Alamat:" + alamat);
        System.out.println("absen:" + usia);
        System.out.println("Usia:" + absen + "tahun");
    }
    
}
