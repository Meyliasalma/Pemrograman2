/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugass_1;

/**
 *
 * @author USER
 */
public class Gabungan {
    public static void main(String[] args) {
        MasterMataKuliah aa = new MasterMataKuliah ();
        MasterDosen bb = new MasterDosen ();
        MasterMahasiswa cc = new MasterMahasiswa ();
        
        System.out.println("-----SIM UNU BLITAR-----");
        System.out.println("Nama Mahasiswa = " + cc.Nama);
        System.out.println("NIM = " + cc.Nim );
        System.out.println("Jenis Kelamin = " + cc.JenisKelamin );
        System.out.println("Nama Dosen Wali = " + bb.DosenWali);
        System.out.println("Nama Dosen Pengampu = " + bb.DosenPengampu);
        System.out.println("Nama Mata Kuliah = " + aa.namaMataKuliah);
        
        
    }
}
