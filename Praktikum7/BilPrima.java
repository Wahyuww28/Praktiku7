package com.Praktikum7;

public class BilPrima {
public void Prima(){
    for (int i = 1; i <= 20; i++) {
        if (i == 1) {
            System.out.println(i + "  =       bukan bilangan prima");
        } else {
            boolean isPrima = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrima = false;
                    break;
                }
            }
            if (isPrima) {
                System.out.println(i + "  =     merupakan bilangan prima");
            } else {
                System.out.println(i + "  =       bukan bilangan prima");

            }
        }
    }

}

}
