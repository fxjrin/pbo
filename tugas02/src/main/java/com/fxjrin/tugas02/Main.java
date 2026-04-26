/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fxjrin.tugas02;

/**
 *
 * @author Fxjrin
 */
public class Main {
    public static void main(String[] args) {

        // Create object with constructor 1
        Mobil m1 = new Mobil();
        m1.tampilData();
        System.out.println("Harga setelah diskon: " + m1.getHargaDiskon());

        System.out.println("------------------");

        // Create object with constructor 2
        Mobil m2 = new Mobil("Toyota", 2022, 300000000);
        m2.tampilData();
        System.out.println("Harga setelah diskon: " + m2.getHargaDiskon());
        
        System.out.println("------------------");

        // Create object Porsche
        Mobil m3 = new Mobil("Porsche 911 GT3 RS", 2023, 5000000000.0);
        m3.tampilData();
        System.out.println("Harga setelah diskon: " + m3.getHargaDiskon());
    }
}