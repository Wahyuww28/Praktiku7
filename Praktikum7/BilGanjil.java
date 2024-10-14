package com.Praktikum7;

public class BilGanjil {
    
    public void GanjilGenap(){
        for(int i = 0; i<=20 ; i++){
            if (i % 2 == 0) {
                System.out.println(i + " Adalah bilangan Genap");
            } else{
                System.out.println(i + " Adalah bilangan Ganjil");
            }
        }
    }
}
