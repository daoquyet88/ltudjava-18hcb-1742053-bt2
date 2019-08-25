/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan_hibernate_qlsv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import DAO.*;
import entities.*;
import java.io.FileReader;
import java.util.List;
import javafx.scene.shape.Mesh;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class LopHocWindow extends javax.swing.JPanel {

    /**
     * Creates new form LopHocWindow
     */
    String path="";
    SinhVienDAO svDAO=new SinhVienDAO();
    public LopHocWindow() {
        initComponents();
        loadON();
    }
    public void loadON(){
        LoadData();
        LoadCB();
    }
    public void LoadCB()
    {
//        DefaultComboBoxModel model=new DefaultComboBoxModel();
//        //model.addElement(new Sinhvien(path));
//        for(entities.Sinhvien sv : this.svDAO.load_danhSach())
//        {
//            
//            model.addElement(new Sinhvien(sv.getMaLop()));
//            //cb_doiBong.addItem(db.getTenDoiBong());
//        }       
//
//        cbLop.setModel(model);
        cbLop.removeAllItems();
        List<String> lsCB=svDAO.layMaLop();
        for(String s : lsCB){
            cbLop.addItem(s);
        }
        
    }
    public void docFile(String p) throws FileNotFoundException, IOException{
   
        File fileDir = new File(p);
        // lay ten file 
        String []tenFile=fileDir.getName().split("\\.");
        JOptionPane.showMessageDialog(cbLop,"ten file"+tenFile[0]);
        String maLop=tenFile[0];
//        BufferedReader br = new BufferedReader(
//                new InputStreamReader(
//                        new FileInputStream(fileDir), "UTF8"));    
        FileReader fr=new FileReader(fileDir);
        BufferedReader br=new BufferedReader(fr);
        String[] dataSV;
        String line = br.readLine();       
        line = br.readLine();
        while (line != null) {
            
               dataSV = line.split(",");
            // tao doi tuong lop hoc
            Sinhvien sv=new Sinhvien();            
            sv.setStt(Integer.parseInt(dataSV[0]));
            sv.setMaSv(dataSV[1]);
            sv.setHoTen(dataSV[2]);
            sv.setGioiTinh(dataSV[3]);
            sv.setCmnd(Integer.parseInt(dataSV[4]));
            sv.setMaLop(maLop);
            svDAO.add(sv);
            line = br.readLine();
        }       

        br.close();
        //fr.close();
        JOptionPane.showMessageDialog(cbLop,"Thêm Thành Công");
        LoadData();
        
    }
    private void LoadData()
    {
        DefaultTableModel dtm=new DefaultTableModel();
        dtm.addColumn("STT");
        dtm.addColumn("MSSV");
        dtm.addColumn("Họ Tên");
        dtm.addColumn("Giới Tính");
        dtm.addColumn("CMND");
        dtm.addColumn("Mã Lớp");
       
        for(entities.Sinhvien sv: this.svDAO.load_danhSach())
        {
            dtm.addRow(new Object[]{sv.getStt(),sv.getMaSv(),sv.getHoTen(),sv.getGioiTinh(),sv.getCmnd(),sv.getMaLop()});
            
        }
        this.tbSinhVien.setModel(dtm);
        this.tbSinhVien.repaint();
        this.tbSinhVien.revalidate();
    }
     private void LoadDatadk(String ma)
    {
        DefaultTableModel dtm=new DefaultTableModel();
        dtm.addColumn("STT");
        dtm.addColumn("MSSV");
        dtm.addColumn("Họ Tên");
        dtm.addColumn("Giới Tính");
        dtm.addColumn("CMND");
        dtm.addColumn("Mã Lớp");
       
        for(entities.Sinhvien sv: this.svDAO.load_danhSach_DK(ma))
        {
            dtm.addRow(new Object[]{sv.getStt(),sv.getMaSv(),sv.getHoTen(),sv.getGioiTinh(),sv.getCmnd(),sv.getMaLop()});
            
        }
        this.tbSinhVien.setModel(dtm);
        this.tbSinhVien.repaint();
        this.tbSinhVien.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbLop = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        lbThongBao = new javax.swing.JLabel();
        lbPath = new javax.swing.JLabel();
        btnLine = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCMND = new javax.swing.JTextField();
        btnThemSV = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSinhVien = new javax.swing.JTable();

        setLayout(null);

        cbLop.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbLopItemStateChanged(evt);
            }
        });
        cbLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLopActionPerformed(evt);
            }
        });
        add(cbLop);
        cbLop.setBounds(490, 100, 196, 30);

        jLabel6.setText("Chọn Lớp ");
        add(jLabel6);
        jLabel6.setBounds(376, 107, 70, 16);

        lbThongBao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbThongBao.setText("Thông Tin Danh Sách Sinh Viên ");
        add(lbThongBao);
        lbThongBao.setBounds(410, 60, 450, 22);

        lbPath.setText("Đường Đẫn");
        add(lbPath);
        lbPath.setBounds(221, 17, 65, 16);

        btnLine.setText("Import Lớp Học");
        btnLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineActionPerformed(evt);
            }
        });
        add(btnLine);
        btnLine.setBounds(12, 13, 147, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Thêm Sinh Viên Vào Lớp Học ");
        add(jLabel1);
        jLabel1.setBounds(60, 56, 237, 20);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("MSSV");

        jLabel3.setText("Họ Tên ");

        jLabel4.setText("Giới Tính");

        jLabel5.setText("CMND");

        btnThemSV.setText("OK");
        btnThemSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSVActionPerformed(evt);
            }
        });

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        rdNam.setText("Nam");

        rdNu.setText("Nữ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnThemSV, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdNam)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdNu)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdNam)
                        .addComponent(rdNu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemSV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        add(jPanel1);
        jPanel1.setBounds(12, 104, 329, 395);

        tbSinhVien.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbSinhVien);

        add(jScrollPane1);
        jScrollPane1.setBounds(359, 143, 750, 360);
    }// </editor-fold>//GEN-END:initComponents

    private void cbLopItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbLopItemStateChanged

        if(cbLop.getSelectedItem()!=null){
            String name = cbLop.getSelectedItem().toString();
            LoadDatadk(name);
        }

    }//GEN-LAST:event_cbLopItemStateChanged

    private void btnLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLineActionPerformed
        
        JFileChooser file =new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));

        // FileNameExtensionFilter fileter=new FileNameExtensionFilter("*.images","jpg","png");
        //file.addChoosableFileFilter(fileter);
        int result=file.showSaveDialog(this);
        if(result==JFileChooser.APPROVE_OPTION)
        {
            File selectedFile=file.getSelectedFile();
            path=selectedFile.getAbsolutePath();
            //lbImg.setIcon(ResizeImage(path,null));
            lbPath.setText(path);
        }
        else{
            System.out.println("NO file select");
        }
        try {
            docFile(path);
            JOptionPane.showMessageDialog(cbLop,"Thêm Thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(cbLop,"Thêm Thành công");
        }
        LoadData();
        LoadCB();
    }//GEN-LAST:event_btnLineActionPerformed

    private void btnThemSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSVActionPerformed
        if(txtCMND.getText().equals("")||txtHoTen.getText().equals("")||txtMSSV.getText().equals("")){
            JOptionPane.showMessageDialog(cbLop,"Nhap Day du thong tin");
            return;
        }
        if(rdNam.isSelected()==false&&rdNu.isSelected()==false){
            JOptionPane.showMessageDialog(cbLop,"Nhap Day du thong tin");
            return;
        }
        int stt=tbSinhVien.getRowCount();
        Sinhvien sv=new Sinhvien();
        String maLop=cbLop.getSelectedItem().toString();
        sv.setStt(stt+1);
        sv.setMaSv(txtMSSV.getText());
        sv.setHoTen(txtHoTen.getText());
        sv.setCmnd(Integer.parseInt(txtCMND.getText()));
        if(rdNam.isSelected()){
            sv.setGioiTinh("Nam");
        }else{
            sv.setGioiTinh("Nu");
        }
        
        sv.setMaLop(maLop);
        try {
            svDAO.add(sv);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(cbLop,"Them That bai");
        }
        LoadDatadk(maLop);
    }//GEN-LAST:event_btnThemSVActionPerformed

    private void cbLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLopActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtCMND.setText("");
        txtHoTen.setText("");
        txtMSSV.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLine;
    private javax.swing.JButton btnThemSV;
    private javax.swing.JComboBox cbLop;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbPath;
    private javax.swing.JLabel lbThongBao;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tbSinhVien;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMSSV;
    // End of variables declaration//GEN-END:variables
}
