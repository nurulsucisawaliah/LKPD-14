/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbahanbakarmobil;

/**
 *
 * @author ASUS
 */
public abstract class Mobil {
    
    public abstract double MinimalBBM();
    public abstract double WaktuTempuh();
    public void Hasil(){
        System.out.println("Bahan Bakar minimal yang diperlukan diperkirakan : " + this.MinimalBBM());
    System.out.println("Lama Waktu Perjalanan  : " + this.WaktuTempuh());
    }
}
