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
public class Tabung extends BangunRuang {

    public double r, t;
    
    public double hitungVolume() {
        double volume = Math.PI * Math.pow(r, 2) * t;
        return volume;
        
    }
    
    public double hitungLuasPermukaan() {
        double LuasPermukaan = Math.PI * r * (r * (2 * t));
        return LuasPermukaan;
    }
}
