/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author ASUS
 */
public class Balok extends BangunRuang {
    
    public double panjang, lebar, t;
    
    public double hitungVolume() {
        double volume = panjang * lebar * t;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double LuasPermukaan = 2 * ((panjang * lebar) * (lebar * t) * (t* panjang));
        return LuasPermukaan;
    }
    
}
