/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fxjrin.uts;

/**
 *
 * @author Fxjrin
 */
public class Main {
    public static void main(String[] args) {

        User user = new User(1, "fxjrin@gmail.com", "123456");
        Penerbit penerbit = new Penerbit(1, "Gramedia", "Jakarta");
        Buku buku = new Buku(1, "Belajar Java", "Fxjrin", 2024, penerbit);

        System.out.println("=== USER ===");
        user.index();
        user.store();
        user.update();
        user.destroy();

        System.out.println("\n=== PENERBIT ===");
        penerbit.index();
        penerbit.store();
        penerbit.update();
        penerbit.destroy();

        System.out.println("\n=== BUKU ===");
        buku.index();
        buku.store();
        buku.update();
        buku.destroy();
    }
}
