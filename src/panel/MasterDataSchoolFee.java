/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;

import config.ConnectDB;
import java.sql.*;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adam x rezaa
 */
public class MasterDataSchoolFee extends javax.swing.JPanel {

    /**
     * Creates new form MasterDataStudent
     */
    public MasterDataSchoolFee() {
        initComponents();
        Init();
        TbLoad();
    }
    
    Statement st;
    PreparedStatement stmt;
    Connection con = ConnectDB.getConnection();
    ResultSet rs;
    DefaultComboBoxModel modelc;
    DefaultTableModel model;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        ToolBar = new javax.swing.JToolBar();
        BtnAdd_Control = new javax.swing.JButton();
        BtnDelete_Control = new javax.swing.JButton();
        BtnEdit_Control = new javax.swing.JButton();
        Separator1 = new javax.swing.JToolBar.Separator();
        BtnRefresh_Control = new javax.swing.JButton();
        PnMain = new javax.swing.JPanel();
        ScPn_Table = new javax.swing.JScrollPane();
        TbMain = new javax.swing.JTable();
        PnAddForm = new javax.swing.JPanel();
        Lb2 = new javax.swing.JLabel();
        TxtClassLevel_AddForm = new javax.swing.JTextField();
        Lb3 = new javax.swing.JLabel();
        TxtSchoolFee_AddForm = new javax.swing.JTextField();
        BtnAdd_AddForm = new javax.swing.JButton();
        BtnSave_AddForm = new javax.swing.JButton();
        BtnClose_AddForm = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        ToolBar.setRollover(true);

        BtnAdd_Control.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_add_24px_3.png"))); // NOI18N
        BtnAdd_Control.setFocusable(false);
        BtnAdd_Control.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAdd_Control.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAdd_Control.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdd_ControlActionPerformed(evt);
            }
        });
        ToolBar.add(BtnAdd_Control);

        BtnDelete_Control.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_trash_24px_2.png"))); // NOI18N
        BtnDelete_Control.setFocusable(false);
        BtnDelete_Control.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnDelete_Control.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnDelete_Control.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDelete_ControlActionPerformed(evt);
            }
        });
        ToolBar.add(BtnDelete_Control);

        BtnEdit_Control.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_edit_24px_3.png"))); // NOI18N
        BtnEdit_Control.setFocusable(false);
        BtnEdit_Control.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEdit_Control.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEdit_Control.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEdit_ControlActionPerformed(evt);
            }
        });
        ToolBar.add(BtnEdit_Control);
        ToolBar.add(Separator1);

        BtnRefresh_Control.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_refresh_24px_1.png"))); // NOI18N
        BtnRefresh_Control.setFocusable(false);
        BtnRefresh_Control.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnRefresh_Control.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnRefresh_Control.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRefresh_ControlActionPerformed(evt);
            }
        });
        ToolBar.add(BtnRefresh_Control);

        add(ToolBar, java.awt.BorderLayout.PAGE_START);

        PnMain.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        PnMain.setLayout(new java.awt.BorderLayout());

        ScPn_Table.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 0, 0));

        TbMain.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        TbMain.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TbMain.setModel(new javax.swing.table.DefaultTableModel(
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
        TbMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbMainMouseClicked(evt);
            }
        });
        ScPn_Table.setViewportView(TbMain);

        PnMain.add(ScPn_Table, java.awt.BorderLayout.CENTER);

        PnAddForm.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 5, 10, 5));
        PnAddForm.setLayout(new java.awt.GridBagLayout());

        Lb2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lb2.setText("Kelas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(Lb2, gridBagConstraints);

        TxtClassLevel_AddForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TxtClassLevel_AddForm.setPreferredSize(new java.awt.Dimension(180, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(TxtClassLevel_AddForm, gridBagConstraints);

        Lb3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lb3.setText("Biaya SPP");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(Lb3, gridBagConstraints);

        TxtSchoolFee_AddForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TxtSchoolFee_AddForm.setPreferredSize(new java.awt.Dimension(180, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(TxtSchoolFee_AddForm, gridBagConstraints);

        BtnAdd_AddForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnAdd_AddForm.setText("Tambah");
        BtnAdd_AddForm.setNextFocusableComponent(BtnClose_AddForm);
        BtnAdd_AddForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdd_AddFormActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        PnAddForm.add(BtnAdd_AddForm, gridBagConstraints);

        BtnSave_AddForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnSave_AddForm.setText("Simpan");
        BtnSave_AddForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSave_AddFormActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        PnAddForm.add(BtnSave_AddForm, gridBagConstraints);

        BtnClose_AddForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_close_24px_1.png"))); // NOI18N
        BtnClose_AddForm.setBorder(null);
        BtnClose_AddForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClose_AddFormActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        PnAddForm.add(BtnClose_AddForm, gridBagConstraints);

        PnMain.add(PnAddForm, java.awt.BorderLayout.PAGE_START);

        add(PnMain, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAdd_ControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdd_ControlActionPerformed
        // TODO add your handling code here:
        ClearAddForm();
        TbLoad();
        TxtClassLevel_AddForm.setEnabled(true);
    }//GEN-LAST:event_BtnAdd_ControlActionPerformed

    private void BtnDelete_ControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDelete_ControlActionPerformed
        // TODO add your handling code here:
        if (TxtClassLevel_AddForm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tidak ada data yang dipilih!", null, JOptionPane.WARNING_MESSAGE);
        } else {
            int jawaban = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data kelas " + TxtClassLevel_AddForm.getText() + "?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if(jawaban == JOptionPane.YES_OPTION) {
                // kode untuk menghapus data
                try {
                    String sql = "DELETE FROM level WHERE id_tingkatan = ?";
                    stmt = con.prepareStatement(sql);
                    stmt.setString(1, TxtClassLevel_AddForm.getText());
                    stmt.executeUpdate();
                    System.out.println(sql);
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                    ClearAddForm();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Data gagal dihapus!" + e, "Peringatan", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        TbLoad();
    }//GEN-LAST:event_BtnDelete_ControlActionPerformed

    private void BtnEdit_ControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEdit_ControlActionPerformed
        // TODO add your handling code here:
        PnAddForm.setVisible(true);
        BtnSave_AddForm.setVisible(true);
        BtnAdd_AddForm.setVisible(false);
        TxtClassLevel_AddForm.setEnabled(false);
    }//GEN-LAST:event_BtnEdit_ControlActionPerformed

    private void BtnRefresh_ControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefresh_ControlActionPerformed
        // TODO add your handling code here:
        TbLoad();
    }//GEN-LAST:event_BtnRefresh_ControlActionPerformed

    private void BtnSave_AddFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSave_AddFormActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE level SET nominal = ? WHERE level.id_tingkatan = ?;";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, TxtSchoolFee_AddForm.getText());
            stmt.setString(2, TxtClassLevel_AddForm.getText());
            System.out.println(sql);

            // Menjalankan perintah untuk menambahkan data baru
            int rowsAffected = stmt.executeUpdate();
            System.out.println(rowsAffected + " baris berhasil diubah ke tabel.");
            JOptionPane.showMessageDialog(null, "Data berhasil diubah");
            ClearAddForm();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        TbLoad();
    }//GEN-LAST:event_BtnSave_AddFormActionPerformed

    private void BtnAdd_AddFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdd_AddFormActionPerformed
        // TODO add your handling code here:
             try {
            String idtingkatan = TxtClassLevel_AddForm.getText();
            String nominal = TxtSchoolFee_AddForm.getText();
               
            if (idtingkatan.isEmpty() || nominal.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Semua kolom harus diisi");
                return; // Menghentikan proses penambahan data
            }

            String sql = "INSERT INTO level (id_tingkatan, nominal) VALUES (?, ?);";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, TxtClassLevel_AddForm.getText());
            stmt.setString(2, TxtSchoolFee_AddForm.getText());
            System.out.println(sql);

            // Menjalankan perintah untuk menambahkan data baru
            int rowsAffected = stmt.executeUpdate();
            
            System.out.println(rowsAffected + " baris berhasil ditambahkan ke tabel.");
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
            ClearAddForm();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        TbLoad();
    }//GEN-LAST:event_BtnAdd_AddFormActionPerformed

    private void BtnClose_AddFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClose_AddFormActionPerformed
        // TODO add your handling code here:
        PnAddForm.setVisible(false);
    }//GEN-LAST:event_BtnClose_AddFormActionPerformed

    private void TbMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbMainMouseClicked
        // TODO add your handling code here:
        BtnEdit_Control.setEnabled(true);
        BtnSave_AddForm.setVisible(true);
        BtnAdd_AddForm.setVisible(false);
        TxtClassLevel_AddForm.setEnabled(false);
        
        int i = TbMain.getSelectedRow();
        TxtClassLevel_AddForm.setText(model.getValueAt(i, 0).toString());
        TxtSchoolFee_AddForm.setText(model.getValueAt(i, 1).toString());
    }//GEN-LAST:event_TbMainMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd_AddForm;
    private javax.swing.JButton BtnAdd_Control;
    private javax.swing.JButton BtnClose_AddForm;
    private javax.swing.JButton BtnDelete_Control;
    private javax.swing.JButton BtnEdit_Control;
    private javax.swing.JButton BtnRefresh_Control;
    private javax.swing.JButton BtnSave_AddForm;
    private javax.swing.JLabel Lb2;
    private javax.swing.JLabel Lb3;
    private javax.swing.JPanel PnAddForm;
    private javax.swing.JPanel PnMain;
    private javax.swing.JScrollPane ScPn_Table;
    private javax.swing.JToolBar.Separator Separator1;
    private javax.swing.JTable TbMain;
    private javax.swing.JToolBar ToolBar;
    private javax.swing.JTextField TxtClassLevel_AddForm;
    private javax.swing.JTextField TxtSchoolFee_AddForm;
    // End of variables declaration//GEN-END:variables
    private void Init() {
        PnAddForm.setVisible(false);
        BtnEdit_Control.setEnabled(false);
    }
    private void TbLoad() {
        String[] judul = {"Kelas","Biaya SPP"};
        model = new DefaultTableModel(judul,0) {
            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            }
        };
        TbMain.setModel(model);
        String sql = "SELECT * FROM level;";
        try {
            rs = con.createStatement().executeQuery(sql);
            
            while(rs.next()) {
               String id = rs.getString("id_tingkatan");
               String value = rs.getString("nominal");
                
               String[] data = {id, value};
               model.addRow(data);
           }
        }catch(Exception e) {
           System.out.println(e);
        }
    }
    private void ClearAddForm() {
        PnAddForm.setVisible(true);
        BtnEdit_Control.setEnabled(false);
        BtnSave_AddForm.setVisible(false);
        BtnAdd_AddForm.setVisible(true);
        
        TxtClassLevel_AddForm.setText("");
        TxtSchoolFee_AddForm.setText("");
    }
}