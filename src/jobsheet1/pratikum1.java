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
public class pratikum1 {
     public static void main(String[] args) {
    Scanner masukan =new Scanner(System.in);
    int r;
    double p=3.14;
    System.out.println("Masukan panjang jari-jari");
    r = masukan.nextInt();
      System.out.println("Luas Permukaan Bola adalah :"+4*p*r*r);
}
}