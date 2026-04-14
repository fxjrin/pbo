/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fxjrin.tugas01.akademis;

/**
 *
 * @author Fxjrin
 */
public class MataKuliah {
    String kodeMk;
    String namaMk;

    // Constructor
    public MataKuliah(String kodeMk, String namaMk) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
    }

    // Display data
    public void tampilData() {
        System.out.println("Kode MK: " + kodeMk);
        System.out.println("Nama MK: " + namaMk);
    }
}
