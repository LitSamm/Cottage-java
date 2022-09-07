/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tes;

/**
 *
 * @author esamk
 */
public class Hitung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan panjang :");
        int panjang = in.nextInt();
         System.out.println("Masukkan lebar :");
        int lebar  = in.nextInt();
        int luas = panjang*lebar;
        System.out.println("Panjang: "+panjang);
        System.out.println("Lebar "+lebar);
        System.out.println("Luas" +luas);
    }
}
