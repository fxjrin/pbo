/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fxjrin.tugas01;

import com.fxjrin.tugas01.akademis.MataKuliah;

/**
 *
 * @author Fxjrin
 */
public class Main {
    public static void main(String[] args) {

        // Create Mahasiswa object
        Mahasiswa mhs = new Mahasiswa("2410020079", "Fajrin Firmana", 4.00, 4);
        mhs.tampilData();

        System.out.println("------------------");

        // Create MataKuliah object
        MataKuliah mk = new MataKuliah("SIF1402", "Pemrograman Berbasis Objek");
        mk.tampilData();
    }
}