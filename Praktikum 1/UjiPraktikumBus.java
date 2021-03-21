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
public class UjiPraktikumBus {
    
      public static void main(String[] args) {
        PraktikumBus Bus = new PraktikumBus (100);
        Bus.getpenumpang(50);
        Bus.cetakpenumpang();
        System.out.println();
        
        Bus.getpenumpang(30);
        Bus.addpenumpang(40);
        Bus.cetakpenumpang();
        System.out.println();
        
        Bus.getpenumpang(50);
        Bus.addpenumpang(39);
        Bus.cetakpenumpang();
        System.out.println();
        
        Bus.getpenumpang(30);
        Bus.addpenumpang(30);
        Bus.cetakpenumpang();
        System.out.println();
        
        Bus.getpenumpang(50);
        Bus.addpenumpang(35);
        Bus.cetakpenumpang();
        
        System.out.println("Rata-rata berat penumpang Bus sekarang = "+ Bus.getAverage());
    }

}
