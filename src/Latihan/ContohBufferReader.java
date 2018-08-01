/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author WINDOWS 10
 */
public class ContohBufferReader {
    public static void main(String[] args) throws IOException{
        String nama;
        //membuat objek inputstream
        InputStreamReader alysia = new   InputStreamReader(System.in);
        //membuat objek bufferreader
        BufferedReader br = new BufferedReader(alysia);
        //Mengisi variabel nama dengan BufferReader
        System.out.print("Inputkan nama: ");
        nama = br.readLine();
        //Tampilkan output isi variabel nama
        System.out.println("Nama kamu adalah " + nama);
        
        
        
    }
}
