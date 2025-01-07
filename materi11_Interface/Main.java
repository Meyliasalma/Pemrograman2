/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materi11_Interface;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        
        Phone VivoY35 = new Xiaomi();
        
        PhoneUser Meymey = new PhoneUser(VivoY35);
        
        Meymey.turnOnThephone();
        
        Scanner input = new Scanner (System.in);
        String aksi = null;
        
        while(true){
            System.out.println("=====APLIKASI INTERFACE=====");
            System.out.println("[1] Nyalakan Hp");
            System.out.println("[2] Matikan Hp");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("Pilih Aksi");
            aksi=input.nextLine();
            if(aksi.equals("1")){
                Meymey.turnOnThephone();
            }
            else if(aksi.equals("2")){
                Meymey.turnOffThePhone();
            }
            else if(aksi.equals("3")){
                Meymey.makePhoneLouder();
            }
            else if(aksi.equals("4")){
                Meymey.makePhoneSilent();
            }
            else if(aksi.equals("0")){
                System.exit(0);
            }
            else{
                System.out.println("Salah woy");
            }
        }
    }
}
