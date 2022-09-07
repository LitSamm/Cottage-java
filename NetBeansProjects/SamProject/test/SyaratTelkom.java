
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author esamk
 */
public class SyaratTelkom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sudah Lulus SMP? (Ya/Tidak)");
        String jawab1 = input.next();
        System.out.println("inputkan usia : ");
        int jawab2 = input.nextInt();
    
        //AND
        if(jawab1.equals("Ya") || jawab2 >= 14) {
            System.out.println("Selamat Datang di SMK Telkom");
        }
    else {
            System.out.println("Tidak Memenuhi Syarat");
       }        
            
    }
}
