/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materi7_konstruktor;

/**
 *
 * @author USER
 */
public class user {
    private String username;
    private String password;
    
    public user (){
        System.out.println("eksekusi method constructor....");
    }
    
}

class DemoConsruktor{
    public static void main(String[] args) {
        user petani = new user();
        
    }
}