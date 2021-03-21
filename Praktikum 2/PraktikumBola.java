/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latenkapsulasi;

/**
 *
 * @author MOKLET-2
 */
public class PraktikumBola {
  
    public double jariJari=7;
    public double diameter;
    public double luasPermukaan;
    public double volume;
    
    public void SetJarijari(){
        jariJari = 7;
        System.out.println("Jari-jari yang digunakan adalah : "+jariJari);
}
    public void showDiameter(){
        diameter= 2*jariJari;
        System.out.println("Diameter yang digunakan adalah : "+ diameter);
    }
    public void showLuasPermukaan(){
        luasPermukaan = 4*Math.PI*jariJari*jariJari;
        System.out.println("Luas permukaan bola : "+ luasPermukaan);
    }
    public void showVolume(){
        volume = 4*Math.PI*jariJari*jariJari*jariJari/3;
        System.out.println("Volume bola : "+ volume);
    }
           
}
