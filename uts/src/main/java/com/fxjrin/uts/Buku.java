/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fxjrin.uts;

/**
 *
 * @author Fxjrin
 */
public class Buku {
    int id;
    String judul;
    String penulis;
    int tahun;
    Penerbit penerbit;

    // Constructor
    public Buku(int id, String judul, String penulis, int tahun, Penerbit penerbit) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        this.penerbit = penerbit;
    }

    public void index() {
        System.out.println(
            "SELECT buku.*, penerbit.namaPenerbit FROM buku " +
            "JOIN penerbit ON buku.penerbit_id = penerbit.id;"
        );
    }

    public void create() {
        System.out.println("FORM CREATE BUKU");
    }

    public void store() {
        System.out.println("INSERT INTO buku (id, judul, penulis, tahun, penerbit_id) VALUES (" 
            + id + ", '" + judul + "', '" + penulis + "', " + tahun + ", " + penerbit.id + ");");
    }

    public void edit() {
        System.out.println("FORM EDIT BUKU WHERE id = " + id);
    }

    public void update() {
        System.out.println("UPDATE buku SET judul = '" + judul + 
            "', penulis = '" + penulis + "', tahun = " + tahun + 
            ", penerbit_id = " + penerbit.id + " WHERE id = " + id + ";");
    }

    public void destroy() {
        System.out.println("DELETE FROM buku WHERE id = " + id + ";");
    }
}
