/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UTS_Pemrograman2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Rental extends javax.swing.JFrame {

    /**
     * Creates new form Rental
     */
    public Rental() {
        initComponents();
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height/ 2;
        this.setLocation(x, y);
        
        tampiltanggal();
        
        kendaraan.disable();
        hargasewa.disable();
        biayasupir.disable();
        Kembalian.disable();
        totalbayar.disable();
        
    }
    //method untuk tanggal hari ini
    public void tampiltanggal(){
        Date tgl = new Date ();
        SimpleDateFormat aa = new SimpleDateFormat("dd-MM-yyyy");
        tanggal.setText(aa.format(tgl));
        
    }
    //method jumlah karakter
    public void JumlahKarakter(KeyEvent a){
        if(notransaksi.getText().length()==4){
            a.consume();
            JOptionPane.showMessageDialog(null,
                    "Maksimal 4 karakter",
                    "Peringatan",JOptionPane.WARNING_MESSAGE);
        }
        
    }
    //method hanya angka
    public void FilterAngka(KeyEvent b){
        if(Character.isAlphabetic(b.getKeyChar())){
            b.consume();
            JOptionPane.showMessageDialog(null,
                    "Masukkan Hanya Angka",
                    "Peringatan",JOptionPane.WARNING_MESSAGE
                    );
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        notransaksi = new javax.swing.JTextField();
        tanggal = new javax.swing.JTextField();
        kendaraan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        hargasewa = new javax.swing.JTextField();
        nopol = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        lamasewa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        supir = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        biayasupir = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        uangbayar = new javax.swing.JTextField();
        Kembalian = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        totalbayar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("RENTAL MOBIL GALAKSI ");

        jLabel2.setText("No.Transaksi ");

        jLabel3.setText("Tanggal");

        jLabel4.setText("No.Polisi ");

        jLabel5.setText("Jenis Kendaraan ");

        notransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notransaksiActionPerformed(evt);
            }
        });
        notransaksi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                notransaksiKeyTyped(evt);
            }
        });

        tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalActionPerformed(evt);
            }
        });

        jLabel6.setText("Harga Sewa/Hari");

        hargasewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargasewaActionPerformed(evt);
            }
        });

        nopol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L5555MS", "L7777ND", "L2222FY", " " }));
        nopol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nopolActionPerformed(evt);
            }
        });

        jLabel7.setText("Lama Sewa ");

        lamasewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamasewaActionPerformed(evt);
            }
        });
        lamasewa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lamasewaKeyTyped(evt);
            }
        });

        jLabel8.setText("Pilihan Supir ");

        supir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jasa Supir", "Tidak Ada Supir" }));
        supir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supirActionPerformed(evt);
            }
        });

        jLabel9.setText("Biaya Supir");

        jLabel10.setText("Total Bayar");

        jLabel11.setText("Uang Bayar");

        uangbayar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                uangbayarFocusLost(evt);
            }
        });
        uangbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uangbayarActionPerformed(evt);
            }
        });
        uangbayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uangbayarKeyTyped(evt);
            }
        });

        Kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembalianActionPerformed(evt);
            }
        });

        jLabel12.setText("Kembalian");

        totalbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalbayarActionPerformed(evt);
            }
        });

        jButton1.setText("BARU ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("HITUNG ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("KELUAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(notransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(nopol, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jButton1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(totalbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(hargasewa, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(lamasewa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(32, 32, 32)
                                        .addComponent(uangbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(37, 37, 37)
                                        .addComponent(Kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton3)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(supir, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(biayasupir))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(notransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargasewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nopol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lamasewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(supir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(biayasupir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addComponent(totalbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(uangbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalActionPerformed

    private void lamasewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lamasewaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lamasewaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        notransaksi.setText("");
        kendaraan.setText("");
        hargasewa.setText("");
        lamasewa.setText("");
        biayasupir.setText("");
        totalbayar.setText("");
        uangbayar.setText("");
        Kembalian.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null,
                "Apakah Yakin Akan Keluar?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void notransaksiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_notransaksiKeyTyped
        // TODO add your handling code here:
        JumlahKarakter(evt);
        FilterAngka (evt);
    }//GEN-LAST:event_notransaksiKeyTyped

    private void nopolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nopolActionPerformed
        // TODO add your handling code here:
        if (nopol.getSelectedItem()== "L5555MS"){
            kendaraan.setText("Mobil Pribadi");
            hargasewa.setText("500000");
}else if (nopol.getSelectedItem()== "L7777ND"){
    kendaraan.setText("Mobil Pickup");
    hargasewa.setText("700000");
}else{
    kendaraan.setText("Mobil Truck");
    hargasewa.setText("1200000");
    
        }
    }//GEN-LAST:event_nopolActionPerformed

    private void supirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supirActionPerformed
        // TODO add your handling code here:
        if(supir.getSelectedItem()== "Jasa Supir"){
            biayasupir.setText("150000");
}else{
            biayasupir.setText("0");
        }
    }//GEN-LAST:event_supirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int sewa = Integer.parseInt(hargasewa.getText());
        int lama = Integer.parseInt(lamasewa.getText());
        int bisup = Integer.parseInt(biayasupir.getText());
        int tobar;
        
        tobar = ((sewa * lama)+ bisup);
        totalbayar.setText(Integer.valueOf(tobar).toString());
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void uangbayarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uangbayarFocusLost
        // TODO add your handling code here:
        int cektotal = Integer.parseInt(totalbayar.getText());
        int cekbayar = Integer.parseInt(uangbayar.getText());
        
        if(cekbayar < cektotal){
            JOptionPane.showMessageDialog(null,
                    "Uang Bayar Kurang Dari Total Bayar",
                    "Peringatan",JOptionpane.WARNING_MESSAGE);
}else{
            int hitungkembalian;
            hitungkembalian = cekbayar - cektotal;
            Kembalian.setText(Integer.valueOf(hitungkembalian).toString());
        }
    }//GEN-LAST:event_uangbayarFocusLost

    private void notransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notransaksiActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_notransaksiActionPerformed

    private void lamasewaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lamasewaKeyTyped
        // TODO add your handling code here:
        FilterAngka (evt);
    }//GEN-LAST:event_lamasewaKeyTyped

    private void uangbayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uangbayarKeyTyped
        // TODO add your handling code here:
        FilterAngka (evt);
    }//GEN-LAST:event_uangbayarKeyTyped

    private void totalbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalbayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalbayarActionPerformed

    private void uangbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uangbayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uangbayarActionPerformed

    private void KembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KembalianActionPerformed

    private void hargasewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargasewaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargasewaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rental().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Kembalian;
    private javax.swing.JTextField biayasupir;
    private javax.swing.JTextField hargasewa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField kendaraan;
    private javax.swing.JTextField lamasewa;
    private javax.swing.JComboBox<String> nopol;
    private javax.swing.JTextField notransaksi;
    private javax.swing.JComboBox<String> supir;
    private javax.swing.JTextField tanggal;
    private javax.swing.JTextField totalbayar;
    private javax.swing.JTextField uangbayar;
    // End of variables declaration//GEN-END:variables
}