/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119033.latihan4.kambing;


/**
 *
 * @author 
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi jenis varibel lokal yang dideklarasikan dalam method/blok
 */
public class Kambing {
    public void tambahKambing() {
        // Deklarasi variabel lokal
        int jumlahKambing = 0;
        jumlahKambing += 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }   
}
