/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugass_2;

/**
 *
 * @author USER
 */
public class ket_lulus {
    private String nama;
    private double nilai;
    
    public ket_lulus(String nama, double nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }
    public String kelulusan() {
        if (nilai >= 70){
            return "Lulus";
        }else {
            return "Tidak Lulus";
        }
    }
    public static void main(String[] args) {
        ket_lulus mahasiswa = new ket_lulus("Watashi", 80);
        String keterangan = mahasiswa.kelulusan();
        System.out.println("Nama= " + mahasiswa.nama);
        System.out.println("Nilai= " + mahasiswa.nilai);
        System.out.println("Keterangan= " + keterangan);
    }
}
