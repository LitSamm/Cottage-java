
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author esamk
 */
public class Order
{
    public static void main(String args[]){
     
    int choice;
    String order;
    Scanner input = new Scanner(System.in);
     
        System.out.println("Menu");
        System.out.println("1. Rawon");
        System.out.println("2. Soto");
        System.out.println("3. Geprek");
        System.out.println("4. Nasgor");
        
        System.out.println("Enter choice(1-4):");
        choice=input.nextInt();
        
        switch(choice)
        {
        case 1 -> {
            order="Rawon";
            System.out.println("Harga = 10.000");
            }
        case 2 -> {
            order="Soto";
            System.out.println("Harga = 8.000");
            }
        case 3 -> {
            order="Geprek";
            System.out.println("Harga = 10.000");
            }
        case 4 -> {
            order="Nasgor";
            System.out.println("Harga = 10.000");
            }
        default -> order="Tidak ada di menu";
  }
        System.out.println("Kamu Memesan "+ order);
}
}
