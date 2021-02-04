
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-01
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //input user
        Scanner input = new Scanner(System.in);
        //output program
        System.out.println("Silahkan pilih perhitungan luas yang diinginkan");
        System.out.println("a. Lingkaran");
        System.out.println("b. Persegi");
        System.out.println("===============================================");
        //pilihan perhitungan luas dari user
        System.out.print("Masukkan pilihan anda(a/b) : ");
        String pilihan = input.nextLine();
        System.out.println("===============================================");
       
        //percabangan yang telah diinputkan oleh user
        switch(pilihan) {
            case "a":
                Lingkaran luas = new Lingkaran();
                luas.hitung();
                break;
            case "b":
                Persegi nilai = new Persegi();
                nilai.hitung();
                break;
            default:
                System.out.println("Kode yang anda masukkan salah");
            
        }
    }
    
}
