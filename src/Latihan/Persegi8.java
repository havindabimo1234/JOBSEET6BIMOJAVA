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
public class Persegi8 {
    public static void main(String[] args) throws IOException{
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        String x = " ";
        int HitungLuas=0;
        System.out.println("---Luas persegi----");
        System.out.print("Masukan nilai sisi : ");
        
        try {
            x = data.readLine();
            int angka = Integer.parseInt(x);
            HitungLuas = angka*angka;
        } catch(Exception e){
            System.out.println("ERROR");
        }
        System.out.println("Luas persegi dengan sisi" + x +"adalah" + HitungLuas);
            
            
            
            
            
        }
        
    }

