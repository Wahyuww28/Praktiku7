package com.Praktikum7;

public class Main {
    public static void main(String[] args) {
        BilGanjil BilGanjil = new BilGanjil();
        AnakAyam Lagu = new AnakAyam();
        HurufZA ZA = new HurufZA();
        BilPrima Prima = new BilPrima();

        System.out.println("A .Bilangan Prima 1-20");
        System.out.println();
        Prima.Prima();


        System.out.println("B .Ganjil genap 1-20");
        System.out.println();
        BilGanjil.GanjilGenap();

        System.out.println("C. Z ke A");
        System.out.println();
        ZA.ZtoA();

        System.out.println();
        System.out.println("D. Anak Ayam");
        System.out.println();
        Lagu.Lagu();
    }
}
