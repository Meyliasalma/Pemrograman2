/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materi6_keyword_this;

/**
 *
 * @author USER
 */
public class main {
    public static void main(String[] args){
        //Membuat objek dari kelas user
        User user = new User();
        
        user.setUsername("Memey");
        user.setPassword("12345");
        
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
    }
    
}


