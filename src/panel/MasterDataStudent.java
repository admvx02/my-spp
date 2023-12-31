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
public class MasterDataStudent extends javax.swing.JPanel {

    /**
     * Creates new form MasterDataStudent
     */
    public MasterDataStudent() {
        initComponents();
        Init();
        SearchBarInit();
        CbClassInit();
        CbCategoryInit();
        CbBatchYearInit();
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
        jLabel1 = new javax.swing.JLabel();
        TxtSearch_Control = new javax.swing.JTextField();
        Lb1 = new javax.swing.JLabel();
        CbClass_Control = new javax.swing.JComboBox<>();
        Lb12 = new javax.swing.JLabel();
        CbShow_Control = new javax.swing.JComboBox<>();
        PnMain = new javax.swing.JPanel();
        ScPn_Table = new javax.swing.JScrollPane();
        TbMain = new javax.swing.JTable();
        PnAddForm = new javax.swing.JPanel();
        Lb2 = new javax.swing.JLabel();
        TxtNIS_AddForm = new javax.swing.JTextField();
        Lb3 = new javax.swing.JLabel();
        TxtNISN_AddForm = new javax.swing.JTextField();
        Lb4 = new javax.swing.JLabel();
        TxtName_AddForm = new javax.swing.JTextField();
        Lb5 = new javax.swing.JLabel();
        CbClass_AddForm = new javax.swing.JComboBox<>();
        Lb6 = new javax.swing.JLabel();
        CbBatchYear_AddForm = new javax.swing.JComboBox<>();
        Lb7 = new javax.swing.JLabel();
        CbCategory_AddForm = new javax.swing.JComboBox<>();
        Lb8 = new javax.swing.JLabel();
        CbGender_AddForm = new javax.swing.JComboBox<>();
        Lb9 = new javax.swing.JLabel();
        TxtAddress_AddForm = new javax.swing.JTextField();
        Lb10 = new javax.swing.JLabel();
        CbReligion_AddForm = new javax.swing.JComboBox<>();
        Lb11 = new javax.swing.JLabel();
        TxtGuardian_AddForm = new javax.swing.JTextField();
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_search_24px_1.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 5));
        ToolBar.add(jLabel1);

        TxtSearch_Control.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ToolBar.add(TxtSearch_Control);

        Lb1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lb1.setText("Kelas");
        Lb1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 5));
        ToolBar.add(Lb1);

        CbClass_Control.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CbClass_Control.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua" }));
        CbClass_Control.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbClass_ControlActionPerformed(evt);
            }
        });
        ToolBar.add(CbClass_Control);

        Lb12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lb12.setText("Tampilkan");
        Lb12.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 5));
        ToolBar.add(Lb12);

        CbShow_Control.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CbShow_Control.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua", "10", "25", "50", "100" }));
        CbShow_Control.setSelectedIndex(3);
        CbShow_Control.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbShow_ControlActionPerformed(evt);
            }
        });
        ToolBar.add(CbShow_Control);

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
        Lb2.setText("NIS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(Lb2, gridBagConstraints);

        TxtNIS_AddForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TxtNIS_AddForm.setNextFocusableComponent(TxtNISN_AddForm);
        TxtNIS_AddForm.setPreferredSize(new java.awt.Dimension(180, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(TxtNIS_AddForm, gridBagConstraints);

        Lb3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lb3.setText("NISN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(Lb3, gridBagConstraints);

        TxtNISN_AddForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TxtNISN_AddForm.setNextFocusableComponent(TxtName_AddForm);
        TxtNISN_AddForm.setPreferredSize(new java.awt.Dimension(180, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(TxtNISN_AddForm, gridBagConstraints);

        Lb4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lb4.setText("Nama");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(Lb4, gridBagConstraints);

        TxtName_AddForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TxtName_AddForm.setNextFocusableComponent(CbClass_AddForm);
        TxtName_AddForm.setPreferredSize(new java.awt.Dimension(180, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(TxtName_AddForm, gridBagConstraints);

        Lb5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lb5.setText("Kelas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(Lb5, gridBagConstraints);

        CbClass_AddForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CbClass_AddForm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih -" }));
        CbClass_AddForm.setNextFocusableComponent(CbBatchYear_AddForm);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(CbClass_AddForm, gridBagConstraints);

        Lb6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lb6.setText("Angkatan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(Lb6, gridBagConstraints);

        CbBatchYear_AddForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CbBatchYear_AddForm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih -" }));
        CbBatchYear_AddForm.setNextFocusableComponent(CbCategory_AddForm);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(CbBatchYear_AddForm, gridBagConstraints);

        Lb7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lb7.setText("Kategori");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(Lb7, gridBagConstraints);

        CbCategory_AddForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CbCategory_AddForm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih -" }));
        CbCategory_AddForm.setNextFocusableComponent(CbGender_AddForm);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(CbCategory_AddForm, gridBagConstraints);

        Lb8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lb8.setText("Jenis Kelamin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(Lb8, gridBagConstraints);

        CbGender_AddForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CbGender_AddForm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih -", "Laki-Laki", "Perempuan" }));
        CbGender_AddForm.setNextFocusableComponent(TxtAddress_AddForm);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(CbGender_AddForm, gridBagConstraints);

        Lb9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lb9.setText("Alamat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(Lb9, gridBagConstraints);

        TxtAddress_AddForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TxtAddress_AddForm.setNextFocusableComponent(CbReligion_AddForm);
        TxtAddress_AddForm.setPreferredSize(new java.awt.Dimension(180, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(TxtAddress_AddForm, gridBagConstraints);

        Lb10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lb10.setText("Agama");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(Lb10, gridBagConstraints);

        CbReligion_AddForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CbReligion_AddForm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih -", "Islam", "Kristen", "Katolik", "Hindu", "Buddha", "Konghucu" }));
        CbReligion_AddForm.setNextFocusableComponent(TxtGuardian_AddForm);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(CbReligion_AddForm, gridBagConstraints);

        Lb11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Lb11.setText("Nama Wali");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(Lb11, gridBagConstraints);

        TxtGuardian_AddForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TxtGuardian_AddForm.setNextFocusableComponent(BtnAdd_AddForm);
        TxtGuardian_AddForm.setPreferredSize(new java.awt.Dimension(180, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnAddForm.add(TxtGuardian_AddForm, gridBagConstraints);

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
        TxtNIS_AddForm.setEnabled(true);
    }//GEN-LAST:event_BtnAdd_ControlActionPerformed

    private void BtnDelete_ControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDelete_ControlActionPerformed
        // TODO add your handling code here:
        if (TxtNIS_AddForm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tidak ada data yang dipilih!", null, JOptionPane.WARNING_MESSAGE);
        } else {
            int jawaban = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data " + TxtName_AddForm.getText() + "?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if(jawaban == JOptionPane.YES_OPTION) {
                // kode untuk menghapus data
                try {
                    String sql = "DELETE FROM student WHERE nis = ?";
                    stmt = con.prepareStatement(sql);
                    stmt.setString(1, TxtNIS_AddForm.getText());
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
        TxtNIS_AddForm.setEnabled(false);
    }//GEN-LAST:event_BtnEdit_ControlActionPerformed

    private void BtnRefresh_ControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefresh_ControlActionPerformed
        // TODO add your handling code here:
        TbLoad();
    }//GEN-LAST:event_BtnRefresh_ControlActionPerformed

    private void CbClass_ControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbClass_ControlActionPerformed
        // TODO add your handling code here:
        TbLoad();
    }//GEN-LAST:event_CbClass_ControlActionPerformed

    private void CbShow_ControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbShow_ControlActionPerformed
        // TODO add your handling code here:
        TbLoad();
    }//GEN-LAST:event_CbShow_ControlActionPerformed

    private void BtnSave_AddFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSave_AddFormActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE student SET nisn = ?, nama = ?, id_kelas = ?, angkatan = ?, id_kategori = ?, jenis_kelamin = ?, alamat = ?, agama = ?, nama_wali = ? WHERE student.nis = ?;";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, TxtNISN_AddForm.getText());
            stmt.setString(2, TxtName_AddForm.getText());
            stmt.setInt(3, CbClass_AddForm.getSelectedIndex());
            stmt.setString(4, CbBatchYear_AddForm.getSelectedItem().toString());
            stmt.setInt(5, CbCategory_AddForm.getSelectedIndex());
            stmt.setString(6, CbGender_AddForm.getSelectedItem().toString());
            stmt.setString(7, TxtAddress_AddForm.getText());
            stmt.setString(8, CbReligion_AddForm.getSelectedItem().toString());
            stmt.setString(9, TxtGuardian_AddForm.getText());
            stmt.setString(10, TxtNIS_AddForm.getText());
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
            String nis = TxtNIS_AddForm.getText();
            String nama = TxtName_AddForm.getText();
            String nisn = TxtNISN_AddForm.getText();
            String alamat = TxtAddress_AddForm.getText();
            String namaWali = TxtGuardian_AddForm.getText();
            String nisFull = nis + nisn;
    
            // Memeriksa apakah NIS/NISN hanya terdiri dari angka
            if (!nisFull.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "NIS dan NISN harus diisi dengan angka");
                return; // Menghentikan proses penambahan data
            }
            
            if (nis.isEmpty() || nama.isEmpty() || nisn.isEmpty() || alamat.isEmpty() || namaWali.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Semua kolom harus diisi");
                return; // Menghentikan proses penambahan data
            }
            int kelasIndex = CbClass_AddForm.getSelectedIndex();
            String angkatan = CbBatchYear_AddForm.getSelectedItem().toString();
            int kategoriIndex = CbCategory_AddForm.getSelectedIndex();
            int jenisKelaminIndex = CbGender_AddForm.getSelectedIndex();
            int agamaIndex = CbReligion_AddForm.getSelectedIndex();

            // Memeriksa apakah opsi yang valid telah dipilih
            if (kelasIndex == 0 || kategoriIndex == 0 || jenisKelaminIndex == 0 || agamaIndex == 0) {
                JOptionPane.showMessageDialog(null, "Silakan pilih opsi yang valid");
                return; // Menghentikan proses penambahan data
            }
            String sql = "INSERT INTO `student` (`nis`, `nama`, `nisn`, `id_kelas`, `angkatan`, `id_kategori`, `jenis_kelamin`, `alamat`, `agama`, `nama_wali`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, nis);
            stmt.setString(2, TxtName_AddForm.getText());
            stmt.setString(3, TxtNISN_AddForm.getText());
            stmt.setInt(4, CbClass_AddForm.getSelectedIndex());
            stmt.setString(5, CbBatchYear_AddForm.getSelectedItem().toString());
            stmt.setInt(6, CbCategory_AddForm.getSelectedIndex());
            stmt.setString(7, CbGender_AddForm.getSelectedItem().toString());
            stmt.setString(8, TxtAddress_AddForm.getText());
            stmt.setString(9, CbReligion_AddForm.getSelectedItem().toString());
            stmt.setString(10, TxtGuardian_AddForm.getText());
            System.out.println(sql);

            // Menjalankan perintah untuk menambahkan data baru
            int rowsAffected = stmt.executeUpdate();

            System.out.println(rowsAffected + " Baris berhasil ditambahkan ke tabel.");
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
        TxtNIS_AddForm.setEnabled(false);
        
        int i = TbMain.getSelectedRow();
        TxtNIS_AddForm.setText(model.getValueAt(i, 0).toString());
        TxtNISN_AddForm.setText(model.getValueAt(i, 1).toString());
        TxtName_AddForm.setText(model.getValueAt(i, 2).toString());
        CbClass_AddForm.setSelectedItem(model.getValueAt(i, 3));
        CbBatchYear_AddForm.setSelectedItem(model.getValueAt(i, 4).toString());
        CbCategory_AddForm.setSelectedItem(model.getValueAt(i, 5));
        CbGender_AddForm.setSelectedItem(model.getValueAt(i, 6));    
        TxtAddress_AddForm.setText(model.getValueAt(i, 7).toString());    
        CbReligion_AddForm.setSelectedItem(model.getValueAt(i, 8));    
        TxtGuardian_AddForm.setText(model.getValueAt(i, 9).toString());
    }//GEN-LAST:event_TbMainMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd_AddForm;
    private javax.swing.JButton BtnAdd_Control;
    private javax.swing.JButton BtnClose_AddForm;
    private javax.swing.JButton BtnDelete_Control;
    private javax.swing.JButton BtnEdit_Control;
    private javax.swing.JButton BtnRefresh_Control;
    private javax.swing.JButton BtnSave_AddForm;
    private javax.swing.JComboBox<String> CbBatchYear_AddForm;
    private javax.swing.JComboBox<String> CbCategory_AddForm;
    private javax.swing.JComboBox<String> CbClass_AddForm;
    private javax.swing.JComboBox<String> CbClass_Control;
    private javax.swing.JComboBox<String> CbGender_AddForm;
    private javax.swing.JComboBox<String> CbReligion_AddForm;
    private javax.swing.JComboBox<String> CbShow_Control;
    private javax.swing.JLabel Lb1;
    private javax.swing.JLabel Lb10;
    private javax.swing.JLabel Lb11;
    private javax.swing.JLabel Lb12;
    private javax.swing.JLabel Lb2;
    private javax.swing.JLabel Lb3;
    private javax.swing.JLabel Lb4;
    private javax.swing.JLabel Lb5;
    private javax.swing.JLabel Lb6;
    private javax.swing.JLabel Lb7;
    private javax.swing.JLabel Lb8;
    private javax.swing.JLabel Lb9;
    private javax.swing.JPanel PnAddForm;
    private javax.swing.JPanel PnMain;
    private javax.swing.JScrollPane ScPn_Table;
    private javax.swing.JToolBar.Separator Separator1;
    private javax.swing.JTable TbMain;
    private javax.swing.JToolBar ToolBar;
    private javax.swing.JTextField TxtAddress_AddForm;
    private javax.swing.JTextField TxtGuardian_AddForm;
    private javax.swing.JTextField TxtNISN_AddForm;
    private javax.swing.JTextField TxtNIS_AddForm;
    private javax.swing.JTextField TxtName_AddForm;
    private javax.swing.JTextField TxtSearch_Control;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    private void Init() {
        PnAddForm.setVisible(false);
        BtnEdit_Control.setEnabled(false);
    }
    private void SearchBarInit() {
        TxtSearch_Control.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                TbLoad();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                TbLoad();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                TbLoad();
            }
        });
    }
    private void CbClassInit() {
        String sql = "SELECT * FROM class";
        try {
            rs = con.createStatement().executeQuery(sql);
            while(rs.next()) {
                CbClass_Control.addItem(rs.getString("nama_kelas"));
                CbClass_AddForm.addItem(rs.getString("nama_kelas"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void CbBatchYearInit() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        
        for (int i = year - 100; i <= year + 100; i++) {
            CbBatchYear_AddForm.addItem(String.valueOf(i));
        }
    }
    private void CbCategoryInit() {
        String sql = "SELECT * FROM category";
        try {
            rs = con.createStatement().executeQuery(sql);
            while(rs.next()) {
                CbCategory_AddForm.addItem(rs.getString("jenis_kategori"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void TbLoad() {
        String[] judul = {"NIS","NISN","Nama","Kelas","Angkatan","Kategori","Jenis Kelamin","Alamat","Agama","Nama Wali"};
        String choice = CbClass_Control.getSelectedItem().toString();
        if (choice == "Semua") {
            choice = "";
        }
        String show;
        if (CbShow_Control.getSelectedIndex() == 0) {
            show = "";
        } else {
            show = " LIMIT " + CbShow_Control.getSelectedItem().toString();
        }
        model = new DefaultTableModel(judul,0) {
            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            }
        };
        TbMain.setModel(model);
        String search = TxtSearch_Control.getText();
        String sql = "SELECT s.nis, s.nisn, s.nama, class.nama_kelas, s.angkatan, ca.jenis_kategori, s.jenis_kelamin, s.alamat, s.agama, s.nama_wali\n" +
                "FROM student s\n" +
                "INNER JOIN class ON s.id_kelas = class.id_kelas\n" +
                "INNER JOIN category ca ON s.id_kategori = ca.id_kategori\n" +
                "WHERE (s.nis LIKE '%"+ search +"%' OR\n" +
                "s.nisn LIKE '%"+ search +"%' OR\n" +
                "s.nama LIKE '%"+ search +"%' OR\n" +
                "s.angkatan LIKE '%"+ search +"%' OR\n" +
                "ca.jenis_kategori LIKE '%"+ search +"%' OR\n" +
                "s.jenis_kelamin LIKE '%"+ search +"%' OR\n" +
                "s.alamat LIKE '%"+ search +"%' OR\n" +
                "s.agama LIKE '%"+ search +"%' OR\n" +
                "s.nama_wali LIKE '%"+ search +"%') AND class.nama_kelas LIKE '%"+ choice +"%'\n" +
                "ORDER BY class.nama_kelas ASC, s.nis ASC" +
                show;
        try {
            System.out.println(sql);
            rs = con.createStatement().executeQuery(sql);
            
            while(rs.next()) {
                String nis = rs.getString("nis");
                String nisn = rs.getString("nisn");
                String nama = rs.getString("nama");
                String kelas = rs.getString("nama_kelas");
                String angkatan = rs.getString("angkatan");
                String jenisKategori = rs.getString("jenis_kategori");
                String jenisKelamin = rs.getString("jenis_kelamin");
                String alamat = rs.getString("alamat");
                String agama = rs.getString("agama");
                String namaWali = rs.getString("nama_wali");

                String[] data = {nis, nisn, nama, kelas, angkatan, jenisKategori, jenisKelamin, alamat, agama, namaWali};
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
        
        TxtNIS_AddForm.setText("");
        TxtNISN_AddForm.setText("");
        TxtName_AddForm.setText("");
        CbClass_AddForm.setSelectedIndex(0);
        CbBatchYear_AddForm.setSelectedIndex(0);
        CbCategory_AddForm.setSelectedIndex(0);
        CbGender_AddForm.setSelectedIndex(0);
        TxtAddress_AddForm.setText("");
        CbReligion_AddForm.setSelectedIndex(0);
        TxtGuardian_AddForm.setText("");
    }
}
