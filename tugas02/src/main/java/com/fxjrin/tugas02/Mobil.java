/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fxjrin.tugas02;

/**
 *
 * @author Fxjrin
 */
public class Mobil {
    String merk;
    int tahun;
    double harga;

    // Constructor 1
    public Mobil() {
        this.merk = "Default";
        this.tahun = 2000;
        this.harga = 100000000;
    }

    // Constructor 2
    public Mobil(String merk, int tahun, double harga) {
        this.merk = merk;
        this.tahun = tahun;
        this.harga = harga;
    }

    // Display data (no return)
    public void tampilData() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
        System.out.println("Harga: " + formatRupiah(harga));
    }

    // Method with return
    public double hitungDiskon() {
        return harga * 0.9;
    }

    // Format rupiah helper
    public String formatRupiah(double value) {
        return "Rp " + String.format("%,.0f", value);
    }

    // Get formatted discount price
    public String getHargaDiskon() {
        return formatRupiah(hitungDiskon());
    }
}