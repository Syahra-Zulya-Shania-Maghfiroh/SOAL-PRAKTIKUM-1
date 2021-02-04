
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
public class Persegi {
    //mendefinisikan atribut
    int s, hasil;
    
    //method hasil perhitungan
    void hitung(){
        //input user
        Scanner input = new Scanner(System.in);
        //output dari user
        System.out.println("Menghitung luas persegi");
        //input s dari user
        System.out.print("Masukkan nilai s : ");
        s = input.nextInt();
        //rumus luas persegi
        hasil = s*s;
        System.out.println("Luas Persegi dengan Sisi "+s+" Adalah " + hasil);
        
        
        
    }
    
}
