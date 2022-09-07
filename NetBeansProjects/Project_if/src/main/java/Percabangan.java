
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author esamk
 */
public class Percabangan {
   public static void main(String args[]){
     
    char nilai;
    Scanner input = new Scanner(System.in);
     
    System.out.print("Pilih Makanan: ");
    nilai = input.next().charAt(0);
     
    if (nilai == 'A' ) {
      System.out.println("Pertahankan!");
    }
    else if (nilai == 'B' ) {
      System.out.println("Harus lebih baik lagi");
    }
    else if (nilai == 'C' ) {
      System.out.println("Perbanyak belajar");
    }
    else if (nilai == 'D' ) {
      System.out.println("Jangan keseringan main");
    }
    else if (nilai == 'E' ) {
      System.out.println("Game teros...");
    }
    else {
      System.out.println("Maaf, format nilai tidak sesuai");
    }
    
  }
} 

