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
public class PraktikumBus {
    
   public double penumpang;
    public double maxPenumpang;
    public int counter;
    public double penumpangBaru;
    
    public PraktikumBus(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    public void addpenumpang (double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if (temp>maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
            counter++;
      }
    }
    public void getpenumpang(int password){
        if (password == 50){
            System.out.println("Password benar");
        }else{
            System.out.println("Password salah");
        }
    }
    public double getAverage (){
        double average;
        return penumpang/counter;
        } 
    public void cetakpenumpang(){
        System.out.println("Berat penumpang Bus sekarang = "+ penumpang);
        System.out.println("Maksimum berat penumpang seharusnya = "+ maxPenumpang);
    }

}
