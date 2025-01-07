/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materi7_konstruktor;

/**
 *
 * @author USER
 */
public class user_parameter {
    public String username;
    public String password;
    
    public user_parameter(String username, String password){
        this.username = username;
        this.password = password;
    }
    
}

class DemoConstructor{
    public static void main(String[] args){
        user_parameter petani = new user_parameter("petanikode","kopi");
        System.out.println("Username: " + petani.username);
        System.out.println("Password: " + petani.password);
}
}

