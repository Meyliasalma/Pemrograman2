/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materi8;

/**
 *
 * @author USER
 */
public class main {
    public static void main(String[] args) {
        User user = new User();
        
        user.SetUsername("MEMEY");
        user.SetPassword("5555");
        
        System.out.println("Usernamenya = " + user.GetUsername());
        System.out.println("Psswordnya = " + user.GetPassword());
    }
    
}
