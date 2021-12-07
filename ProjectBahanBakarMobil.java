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
public class ProjectBahanBakarMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MobilSedan ms = new MobilSedan();
        MobilSUV msuv = new MobilSUV();
        MobilMPV mmpv = new MobilMPV();
        
        String[][] jenisDataMobil = {
            {"A", "Sedan", "107", "60"},
            {"B", "Sedan", "538", "65"},
            {"c", "SUV", "662", "57"},
            {"D", "SUV", "471", "62"},
            {"E", "MPV", "541", "64"},
            {"F", "MPV", "443", "53"},
        };
        
        for(int x=0; x <= jenisDataMobil.length - 1; x++){
            if(jenisDataMobil[x][1] == "Sedan"){
                ms.jarakMobil = Double.parseDouble(jenisDataMobil[x][2]);
                ms.kecepatMobil = Double.parseDouble(jenisDataMobil[x][3]);
                
                System.out.println("Mobil " + jenisDataMobil[x][0]);
                
                ms.MinimalBBM();
                ms.WaktuTempuh();
                ms.Hasil();
            } else if (jenisDataMobil[x][1] == "SUV"){
                msuv.jarakMobil = Double.parseDouble(jenisDataMobil[x][2]);
                msuv.kecepatMobil = Double.parseDouble(jenisDataMobil[x][3]);
                
                System.out.println("Mobil " + jenisDataMobil[x][0]);
                
                msuv.MinimalBBM();
                msuv.WaktuTempuh();
                msuv.Hasil();
            } else if (jenisDataMobil[x][1] == "MPV"){
                mmpv.jarakMobil = Double.parseDouble(jenisDataMobil[x][2]);
                mmpv.kecepatMobil = Double.parseDouble(jenisDataMobil[x][3]);
                
                System.out.println("Mobil " + jenisDataMobil[x][0]);
                
                mmpv.MinimalBBM();
                mmpv.WaktuTempuh();
                mmpv.Hasil();
            }
        }
    }
    
}
