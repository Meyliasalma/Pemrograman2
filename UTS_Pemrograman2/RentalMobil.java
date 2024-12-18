

package UTS_Pemrograman2;

/**
 *
 * @author USER
 */
public class RentalMobil {
    private mobil mobil;
    private pelanggan pelanggan;
    private int lamasewa;
    
public void hitungtotalbiaya (){
    int totalbiaya = mobil.gethargasewa()* lamasewa;
    
}
    class mobil {
        private String nopol;
        private String kendaraan;
        private String hargasewa;    

        private int gethargasewa() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    class pelanggan{
        private String nama;
        private String alamat;
    }
    
}
    