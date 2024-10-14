package com.BPraktikum7;

import java.util.Scanner;

public class Tabel {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai (1-10): ");
        int n = scanner.nextInt();
        
        
        if (n > 10 || n < 1) {
           
        } else {
            
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(i * j + "\t");
                }
                System.out.println();
            }
        }
        
        scanner.close();
    }
}
