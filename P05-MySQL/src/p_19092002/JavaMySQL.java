package p_19092002;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WIN10
 */
public class JavaMySQL extends javax.swing.JFrame {
     int idBaris = 0;
     String role;
     DefaultTableModel model;
    /**
     * Creates new form JavaMySQL
     */
    public JavaMySQL() {
        initComponents();
        
        KoneksiDB.sambunganDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        areaSplit = new javax.swing.JSplitPane();
        panelkiri = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNIDN = new javax.swing.JTextField();
        txtNAMA = new javax.swing.JTextField();
        cmbJafung = new javax.swing.JComboBox();
        cmbPangkat = new javax.swing.JComboBox();
        txtNOHP = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnTutup = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        btnTambah.setText("Tambah Data");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus Data ");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        btnCari.setText("Cari");

        areaSplit.setDividerLocation(300);
        areaSplit.setDividerSize(10);
        areaSplit.setOneTouchExpandable(true);

        jLabel2.setText("NIDN ");

        jLabel3.setText("NAMA ");

        jLabel4.setText("JABATAN FUNGSIONAL");

        jLabel5.setText("PANGKAT/GOLONGAN");

        jLabel6.setText("NO.HP");

        cmbJafung.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbPangkat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnTutup.setText("Tutup");
        btnTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutupActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelkiriLayout = new javax.swing.GroupLayout(panelkiri);
        panelkiri.setLayout(panelkiriLayout);
        panelkiriLayout.setHorizontalGroup(
            panelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelkiriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(panelkiriLayout.createSequentialGroup()
                        .addGroup(panelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelkiriLayout.createSequentialGroup()
                                .addGroup(panelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelkiriLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18))
                                    .addGroup(panelkiriLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(14, 14, 14)))
                                .addGroup(panelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNIDN, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNAMA, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelkiriLayout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbJafung, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelkiriLayout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbPangkat, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelkiriLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNOHP, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelkiriLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTutup)
                .addGap(18, 18, 18)
                .addComponent(btnSimpan)
                .addGap(20, 20, 20))
        );
        panelkiriLayout.setVerticalGroup(
            panelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelkiriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNIDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNAMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbJafung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbPangkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNOHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTutup)
                    .addComponent(btnSimpan))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        areaSplit.setLeftComponent(panelkiri);

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);

        areaSplit.setRightComponent(jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(areaSplit, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTambah)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus)
                        .addGap(18, 18, 18)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnCari))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(areaSplit, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
       role = "Tambah";
       btnSimpan.setText("SIMPAN");
       idBaris = 0;
       resetForm();
        showForm(true);
        btnHapus.setEnabled(false);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if (role.equals("Tambah")) {
            simpanData();
        } else if (role.equals("Ubah")) {
            ubahData();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutupActionPerformed
        resetForm();
        showForm(false);
        btnHapus.setEnabled(false);
        idBaris =0;
    }//GEN-LAST:event_btnTutupActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if (idBaris == 0) {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan "
            + "dihapus!");
            
        } else {
            hapusData(idBaris);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
        String key = txtCari.getText();
        showData(key);
    }//GEN-LAST:event_txtCariKeyReleased

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        areaSplit.setDividerLocation(0.3);
    }//GEN-LAST:event_formComponentResized

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        role = "Ubah";
        int row = tblData.getRowCount();
        if(row > 0) {
            int sel = tblData.getSelectedRow();
            if(sel != -1){
                pilihData(tblData.getValueAt(sel, 0).toString());
               btnSimpan.setText("Ubah Data");
        }
        }
    }//GEN-LAST:event_tblDataMouseClicked

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
            java.util.logging.Logger.getLogger(JavaMySQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaMySQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaMySQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaMySQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaMySQL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane areaSplit;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTutup;
    private javax.swing.JComboBox cmbJafung;
    private javax.swing.JComboBox cmbPangkat;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panelkiri;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtNAMA;
    private javax.swing.JTextField txtNIDN;
    private javax.swing.JTextField txtNOHP;
    // End of variables declaration//GEN-END:variables

    private void aturModelTabel() {
        Object[] kolom = {"No","NIDN","NAMA","JAFUNG","Golongan/Pangkat","No HP"};
        model = new DefaultTableModel(kolom,0) {
            boolean[] canEdit = new boolean[] {
                false, false, false, false, false, false
            };
            
            @Override
            public  boolean isCellEditable(int rowIndex, int columnIndex) {
                return  canEdit [columnIndex];
            }
        };
        tblData.setModel(model);
        tblData.setRowHeight(20);
        tblData.getColumnModel().getColumn(0).setMinWidth(0);
        tblData.getColumnModel().getColumn(0).setMaxWidth(0);
       }
    
    private void showForm(boolean b) {
        areaSplit.setDividerLocation(0.3);
        areaSplit.getLeftComponent().setVisible(b);
    }
    
    private void resetForm(){
        tblData.clearSelection();
        txtNIDN.setText("");
        txtNAMA.setText("");
        cmbJafung.setSelectedIndex(0);
        cmbPangkat.setSelectedIndex(0);
        txtNOHP.setText("");
        txtNIDN.requestFocus();
    }
    
    private void pangkat(){
        cmbPangkat.removeAllItems();
        cmbPangkat.addItem("Pilihan Golongan/Pangkat");
        cmbPangkat.addItem("Belum ada");
        cmbPangkat.addItem("II/c (Pengaturan)");
        cmbPangkat.addItem("II/d (Pengaturan Tk. I)");
        cmbPangkat.addItem("III/a (Penata Muda)");
        cmbPangkat.addItem("III/b (Penata Muda Tk. I)");
        cmbPangkat.addItem("III/c (Penata)");
        cmbPangkat.addItem("III/d (Penata Tk. I)");
        cmbPangkat.addItem("IV/a (Pembina)");
        cmbPangkat.addItem("IV/b (Pembina Tk. I)");
        cmbPangkat.addItem("IV/c (Pembina Utama Muda)");
        cmbPangkat.addItem("IV/d (Pembina Utama Madya)");
        cmbPangkat.addItem("IV/e (Pembina Utama)");
    }
    
    private void jabatan(String key) {
        model.getDataVector().removeAllElements();
        cmbJafung.addItem("Pilihan Jabatan");
        cmbJafung.addItem("Belum ada");
        cmbJafung.addItem("Asisten Ahli (100)");
        cmbJafung.addItem("PAsisten Ahli (150)");
        cmbJafung.addItem("Lektor (200)");
        cmbJafung.addItem("Lektor (200)");
        cmbJafung.addItem("Lektor Kepala (400)");
        cmbJafung.addItem("Lektor Kepala (550)");
        cmbJafung.addItem("Lektor Kepala (700)");
        cmbJafung.addItem("Profesor (850)");
        cmbJafung.addItem("Profesor (1050)");
    }
    
    private void showData(String key){
       model.getDataVector().removeAllElements();
       String where = "";
       if(!key.isEmpty()){
          where += "WHERE nidn LIKE '%"+key+"%' "
                  + "OR nama LIKE '%"+key+"%' "
                  + "OR jabatan_fungsional LIKE '%"+key+"%' "
                  + "OR pangkat_golongan LIKE '%"+key+"%' "
                  + "OR no_hp LIKE '%"+key+"%'";
        }
        String sql = "SELECT * FROM data_dosen "+where;
        Connection con;
        Statement st;
        ResultSet rs;
        int baris = 0;
        try {
            con = KoneksiDB.sambungDB();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Object id = rs.getInt(1);
                Object nidn = rs.getString(2);
                Object nama = rs.getString(3);
                Object jafung = rs.getString(4);
                Object pangkat = rs.getString(5);
                Object no_hp = rs.getString(6);
                Object[] data = {id,nidn,nama,jafung,pangkat,no_hp};
                model.insertRow(baris, data);
                baris++;
            }
            st.close();
            con.close();
            tblData.revalidate();
            tblData.repaint();
        } catch (SQLException e) {
            System.err.println("showData(): "+e.getMessage());
        }
         }
    
    private void resetView() {
        resetForm();
        showForm(false);
        showData("");
        btnHapus.setEnabled(false);
       idBaris =0;
    }
    
    private void pilihData(String n) {
        btnHapus.setEnabled(true);
        
        String sql = "SELECT * FROM data_dosen WHERE id='"+n+"'";
        Connection con;
        Statement st;
        ResultSet rs;
        try {
            con= KoneksiDB.sambungDB();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(1);
                String nidn = rs.getString(2);
                String nama = rs.getString(3);
                Object jabatan = rs.getString(4);
                Object pangkat = rs.getString(5);
                String no_hp = rs.getString(6);
                idBaris = id;
                txtNIDN.setText(nidn);
                txtNAMA.setText(nama);
                cmbJafung.setSelectedItem(jabatan);
                cmbPangkat.setSelectedItem(pangkat);
                txtNOHP.setText(no_hp);
            }
            st.close();
            con.close();
            showForm(true);
        } catch (SQLException e) {
            System.out.println("pilihData(): "+e.getMessage());
        }
    }
    
    private void simpanData() {
        String nidn = txtNIDN.getText();
        String nama = txtNAMA.getText();
        int jabatan = cmbJafung.getSelectedIndex();
        int pangkat = cmbPangkat.getSelectedIndex();
        String nohp = txtNOHP.getText();
        if (nidn.isEmpty() || nama.isEmpty() || jabatan==0 || pangkat==0 ||
            nohp.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mohon Lengkapi Data!");
          
        } else {
            String jabatan_isi = cmbJafung.getSelectedItem().toString();
            String pangkat_isi = cmbPangkat.getSelectedItem().toString();
            
            String sql =
                    "INSERT INTO data_dosen (nidn,nama,jabatan_fungsional,"
                    +"pangkat_golongan,no_hp)"
                    +"VALUES (\""+nidn+"\""+nama+"\","
                    +"\""+jabatan_isi+"\",\""+pangkat_isi+"\",\"" +nohp+
                    "\")";
            
            Connection con;
            Statement st;
            try {
                con = KoneksiDB.sambungDB();
                st = con.createStatement();
                st.executeUpdate(sql);
                st.close();
                con.close();
                
                resetView();
                JOptionPane.showMessageDialog(this, "Data telah disimpan!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }
    
    private void ubahData() {
        String nidn = txtNIDN.getText();
        String nama = txtNAMA.getText();
        int jabatan = cmbJafung.getSelectedIndex();
        int pangkat = cmbPangkat.getSelectedIndex();
        String nohp = txtNOHP.getText();
        if (nidn.isEmpty() || nama.isEmpty() || jabatan==0 || pangkat==0 ||
                nohp.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mohon lengkapi data!");
          
        } else {
            String jabatan_isi = cmbJafung.getSelectedItem().toString();
            String pangkat_isi = cmbPangkat.getSelectedItem().toString();
            
            String sql = "UPDATE data_dosen"
                    +"SET nidn=\""+nidn+"\","
                    +"nama=\""+nama+"\","
                    +"jabatan_fungsional=\""+jabatan_isi+"\","
                    +"pangkat_golongan=\""+pangkat_isi+"\","
                    +"no_hp=\""+nohp+"\"WHERE id=\""+idBaris+"\"";
            
            Connection con;
            Statement st;
            try {
                con = KoneksiDB.sambungDB();
                st = con.createStatement();
                st.executeUpdate(sql);
                st.close();
                
                resetView();
                JOptionPane.showMessageDialog(this, "Data telah diubah!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
                    
        }
    }
    
    private void hapusData(int baris) {
        Connection con;
        Statement st;
        try {
            con = KoneksiDB.sambungDB();
            st = con.createStatement();
            st.executeUpdate("DELETE FROM data_dosen WHERE id="+baris);
            st.cancel();
            con.close();
            
            resetView();
            JOptionPane.showMessageDialog(this, "Data telah dihapus");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
 
}
