
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
public class Lingkaran {
    //mendefinisikan atribut
    double r, hasil;
    
    //method hasil perhitungan
    void hitung(){
        //input dari user
        Scanner input = new Scanner(System.in);
        //output dari user
        System.out.println("Menghitung Luas Lingkaran");
        //input r dari user
        System.out.print("Masukkan nilai r : ");
        r = input.nextInt();
        //rumus luas lingkaran
        hasil = 3.14*r*r;
        System.out.println("Luas Lingkaran dengan Jari-Jari "+r+" Adalah " +hasil);
        
    }
    
}
