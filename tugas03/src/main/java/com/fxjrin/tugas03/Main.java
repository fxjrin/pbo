/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fxjrin.tugas03;

/**
 *
 * @author Fxjrin
 */
public class Main {
    public static void main(String[] args) {

        // Object constructor 1
        Kendaraan k1 = new Kendaraan();
        k1.tampilData();
        k1.create();
        k1.read();
        k1.update();
        k1.delete();

        System.out.println("------------------");

        // Object constructor 2
        Kendaraan k2 = new Kendaraan("Toyota");
        k2.tampilData();

        System.out.println("------------------");

        // Object constructor 3
        Kendaraan k3 = new Kendaraan(
            1,
            "Honda",
            "Civic",
            2022,
            500000000
        );

        k3.tampilData();
        System.out.println(
            "Pajak: Rp " +
            String.format("%,.0f", k3.hitungPajak())
        );

        System.out.println("------------------");

        // Child object
        MobilSport m1 = new MobilSport(
            2,
            "Porsche",
            "911 GT3 RS",
            2024,
            5000000000.0,
            296,
            518
        );

        m1.tampilData();
        m1.tampilPerforma();

        System.out.println(
            "Boost Speed: " +
            m1.hitungKecepatan() +
            " km/h"
        );
    }
}