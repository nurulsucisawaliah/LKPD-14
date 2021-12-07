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
public class MobilSedan extends Mobil {

    public double kecepatMobil, jarakMobil;
    
    public double MinimalBBM(){
        double minimalBBM = jarakMobil / 10;
        return minimalBBM;
    }
    
    public double WaktuTempuh(){
        double LTempuh = jarakMobil / kecepatMobil;
        return LTempuh;
    }
}
