/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet1;

import java.util.Scanner;

/**
 *
 * @author Mikedhanny
 */
public class pratikum3 {
      public static void main(String[] args) {
         Scanner masukan = new Scanner(System.in);
       String nama, tempat, jenis, alamat, motto, tanggal;
       int nis;
       System .out.println("Masukan Nama :");
       nama = masukan.next();
        System .out.println("Masukan NIS :");
       nis = masukan.nextByte();
      System .out.println("Masukan Tempat Lahir :");
       tempat = masukan.next();
        System .out.println("Masukan Tanggal Lahir :");
       tanggal = masukan.next();
        System .out.println("Masukan Jenis Kelamin :");
       jenis = masukan.next();
       System .out.println("Masukan Alamat :");
       alamat = masukan.next();
        System .out.println("Masukan Motto hidup :");
       motto = masukan.next();
       
         System .out.println("==================== :");
        System .out.println("Biodata :");
        System .out.println("==================== :");
         System .out.println("Nama  : "+nama);
             System .out.println("Nis : "+nis);
             System .out.println("Tempat Lahir : "+tempat);
             System .out.println("Tanggal lahir : "+tanggal);
             System .out.println("Jenis kelamin : "+jenis);
             System .out.println("Alamat : "+alamat);
             System .out.println("Motto Hidup : "+motto);
      }
}
