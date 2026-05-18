/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fxjrin.tugas03;

/**
 *
 * @author Fxjrin
 */
public class MobilSport extends Kendaraan {
    int topSpeed;
    int horsePower;

    // Constructor
    public MobilSport(
        int id,
        String merk,
        String model,
        int tahun,
        double harga,
        int topSpeed,
        int horsePower
    ) {
        super(id, merk, model, tahun, harga);

        this.topSpeed = topSpeed;
        this.horsePower = horsePower;
    }

    // Method 1
    public void tampilPerforma() {
        System.out.println("Top Speed: " + topSpeed + " km/h");
        System.out.println("Horse Power: " + horsePower + " HP");
    }

    // Method 2
    public int hitungKecepatan() {
        return topSpeed + 20;
    }
}