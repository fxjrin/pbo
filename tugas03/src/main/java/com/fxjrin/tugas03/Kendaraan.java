/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fxjrin.tugas03;

/**
 *
 * @author Fxjrin
 */
public class Kendaraan {
    int id;
    String merk;
    String model;
    int tahun;
    double harga;

    // Constructor 1
    public Kendaraan() {
        this.id = 0;
        this.merk = "Default";
        this.model = "Default";
        this.tahun = 2000;
        this.harga = 100000000;
    }

    // Constructor 2
    public Kendaraan(String merk) {
        this.id = 1;
        this.merk = merk;
        this.model = "Unknown";
        this.tahun = 2020;
        this.harga = 200000000;
    }

    // Constructor 3
    public Kendaraan(int id, String merk, String model, int tahun, double harga) {
        this.id = id;
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.harga = harga;
    }

    // Display data
    public void tampilData() {
        System.out.println("ID: " + id);
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahun);
        System.out.println("Harga: Rp " + String.format("%,.0f", harga));
    }

    // Method with return
    public double hitungPajak() {
        return harga * 0.1;
    }

    // CRUD SQL
    public void create() {
        System.out.println(
            "INSERT INTO kendaraan (id, merk, model, tahun, harga) VALUES (" +
            id + ", '" + merk + "', '" + model + "', " + tahun + ", " +
            String.format("%.0f", harga) + ");"
        );
    }

    public void read() {
        System.out.println("SELECT * FROM kendaraan;");
    }

    public void update() {
        System.out.println(
            "UPDATE kendaraan SET merk = '" + merk +
            "' WHERE id = " + id + ";"
        );
    }

    public void delete() {
        System.out.println("DELETE FROM kendaraan WHERE id = " + id + ";");
    }
}