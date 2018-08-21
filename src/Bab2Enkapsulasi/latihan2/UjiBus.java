/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab2Enkapsulasi.latihan2;

/**
 *
 * @author Mikedhanny
 */
public class UjiBus {
    public static void main(String[] args) {
        
        Bus busBesar;
        busBesar = new Bus(40);
        busBesar.cetak();
        
        busBesar.addPenumpang(15);
        busBesar.cetak();
        
        
        busBesar.addPenumpang(5);
        busBesar.cetak();
        
        busBesar.addPenumpang(26);
        busBesar.cetak();
        
    }
}
