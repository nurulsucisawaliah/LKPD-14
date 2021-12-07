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
public  class Bola extends BangunRuang{
    public double r;
    // r adalah jari-jari 
    public double hitungVolume() {
        double volume = (4/3) * 3.14 * Math.pow(r, 3);
        return volume;
    }

    
    public double hitungPermukaanLuas() {
        double LuasPermukaan= 4 * Math.PI * Math.pow(r, 2);
        return LuasPermukaan;
    }


}
