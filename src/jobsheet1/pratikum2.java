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
public class pratikum2 {
      public static void main(String[] args) {
         Scanner masukan = new Scanner(System.in);
         float R,F,K;
         System.out.println("Masukan nilai suhu dari Celsius");
         float C = masukan.nextInt();
         System.out.println("Pilih Konversi ke K, R, F :");
         String pilihan = masukan.next();
        switch (pilihan ){ 
               case "K" :
          System.out.println("Hasil :" + (K = C+273));
          break;
          case "R" :
          System.out.println("Hasil :" + (R = C*4/5));
          break;
            case "F" :
          System.out.println("Hasil :" + (F = C*9/5+32));
          break;
    
      }
      }
}
