/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fxjrin.uts;

/**
 *
 * @author Fxjrin
 */
public class Penerbit {
    int id;
    String namaPenerbit;
    String alamatPenerbit;

    // Constructor
    public Penerbit(int id, String namaPenerbit, String alamatPenerbit) {
        this.id = id;
        this.namaPenerbit = namaPenerbit;
        this.alamatPenerbit = alamatPenerbit;
    }

    public void index() {
        System.out.println("SELECT * FROM penerbit;");
    }

    public void create() {
        System.out.println("FORM CREATE PENERBIT");
    }

    public void store() {
        System.out.println("INSERT INTO penerbit (id, namaPenerbit, alamatPenerbit) VALUES (" 
            + id + ", '" + namaPenerbit + "', '" + alamatPenerbit + "');");
    }

    public void edit() {
        System.out.println("FORM EDIT PENERBIT WHERE id = " + id);
    }

    public void update() {
        System.out.println("UPDATE penerbit SET namaPenerbit = '" + namaPenerbit + 
            "', alamatPenerbit = '" + alamatPenerbit + "' WHERE id = " + id + ";");
    }

    public void destroy() {
        System.out.println("DELETE FROM penerbit WHERE id = " + id + ";");
    }
}
