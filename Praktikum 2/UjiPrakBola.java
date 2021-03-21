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
public class UjiPrakBola {
    
    public static void main(String[] args) {
        PraktikumBola Bola = new PraktikumBola();
        Bola.showDiameter();
        Bola.showLuasPermukaan();
        Bola.showVolume();
        System.out.println();
        Bola.SetJarijari();
        Bola.showDiameter();
        Bola.showLuasPermukaan();
        Bola.showVolume();
        
    }
}
