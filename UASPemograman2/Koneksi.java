
package UASPemograman2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Koneksi {
    private Connection koneksi; 
    public static void main(String[] args) {
        Connection conn = new Koneksi ().Connect();
        Scanner in = new Scanner(System.in);
    }
    public Connection Connect(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Ditemukan ");
        }catch (ClassNotFoundException ex){
            System.out.println("Driver Tidak ditemukan " + ex);
        }
        String url = "jdbc:mysql://localhost:3306/hpcell";
        try {
            koneksi = DriverManager.getConnection(url, "root", "");
            System.out.println("Berhasil Koneksi Database");
        }catch (SQLException ex) {
            System.out.println("Gagal Koneksi Database" + ex);
        }
        return koneksi;
    }
    
}
