/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangun;

import bangundatar.Lingkaran;
import bangundatar.Persegi;
import bangundatar.PersegiPanjang;
import bangunruang.Balok;
import bangunruang.Bola;
import bangunruang.Tabung;

/**
 *
 * @author ASUS
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Persegi persegi = new Persegi();
        PersegiPanjang ppanjang = new PersegiPanjang();
        Lingkaran lingkaran = new Lingkaran();
        Tabung tabung = new Tabung();
        Balok balok = new Balok();
        Bola bola = new Bola();
        
        //Persegi
        persegi.sisi = 10;
        System.out.println("Persegi dengan panjang sisi " + persegi.sisi);
        persegi.hitungLuas();
        persegi.hitungKeliling();
        persegi.tampilHasil();

         //Persegi Panjang
        ppanjang.panjangPersegi = 10;
        ppanjang.lebarPersegi = 15;
        System.out.println("\nPersegi panjang dengan panjang " + ppanjang.panjangPersegi + " dan lebar " + ppanjang.lebarPersegi);
        ppanjang.hitungLuas();
        ppanjang.hitungKeliling();
        ppanjang.tampilHasil();
        
        //Lingkaran
        lingkaran.jari2 = 15;
        System.out.println("\nLingkgaran dengan jari - jari " + lingkaran.jari2);
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
        lingkaran.tampilHasil();
        
        //Balok
        balok.panjang = 2;
        balok.lebar = 4;
        balok.t = 6;
        System.out.println("\npanjang Balok   " + balok.panjang + ",lebar " + balok.lebar + " dan tinggi " + balok.t);
        balok.hitungVolume();
        balok.hitungLuasPermukaan();
        balok.hitungHasil();
        
        //Tabung
        tabung.r = 10;
        tabung.t = 20;
        System.out.println("\nTabung jari - jari " + tabung.r + "tinggi" + tabung.t);
        tabung.hitungVolume();
        tabung.hitungLuasPermukaan();
        tabung.hitungHasil();
        
        //Bola
        bola.r = 10;
        System.out.println("\nBola  jari - jari " + bola.r);
        bola.hitungVolume();
        bola.hitungLuasPermukaan();
        bola.hitungHasil();           
    }
   
}
