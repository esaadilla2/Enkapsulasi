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
public class TestSiswa {
    
    public static void main(String[] args) {
        EncapSiswa Siswa = new EncapSiswa();
        Siswa.setName("Julian");
        Siswa.setAbsen(23);
        Siswa.setAddress("Malang");
        
        System.out.println("Name : "+ Siswa.getName()); 
        System.out.println ("Absen : "+ Siswa.getAbsen());
        System.out.println("Address : " + Siswa.getAddress());
        
    }
}
