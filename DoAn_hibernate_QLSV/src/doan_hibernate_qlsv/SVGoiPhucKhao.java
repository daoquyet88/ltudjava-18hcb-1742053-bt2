
package doan_hibernate_qlsv;
import DAO.*;
import entities.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Admin
 */
public class SVGoiPhucKhao extends javax.swing.JFrame {

    /**
     * Creates new form SVGoiPhucKhao
     */
    String maLop;
    String maSV;
    String maMon;
    String hoTen;
    QLPhucKhaoDAO qlpkDAO=new QLPhucKhaoDAO();
    public SVGoiPhucKhao(String ma) {
        initComponents();
        txtMaSV.setText(ma);
        maSV=ma;
        loadData();
    }
    public SVGoiPhucKhao( String malop,String mamon,String masv,String hoten) {
        initComponents();
        txtMaSV.setText(masv);
        txtMaLop.setText(malop);
        txtMaMon.setText(mamon);
        txtHoTen.setText(hoten);
        maSV=masv;
        loadData();
    }
     private void loadData()
    {
        DefaultTableModel dtm=new DefaultTableModel();
        dtm.addColumn("STT");
        dtm.addColumn("MSSV");
        dtm.addColumn("Ma Lop");
        dtm.addColumn("Họ Tên");
        dtm.addColumn("GK");
        dtm.addColumn("CK");
        dtm.addColumn("DK");
        dtm.addColumn("Tong ĐIểm");
        dtm.addColumn("Điểm MM");
         dtm.addColumn("Lý Do");
        dtm.addColumn("Tình Trang");
        for(entities.Svphuckhao sv: this.qlpkDAO.load_danhSach_SV(maSV))
        {
            dtm.addRow(new Object[]{sv.getStt(),sv.getId().getMaLop(),sv.getId().getMaSv(),sv.getId().getMaMon(),sv.getGiuaKy(),
            sv.getCuoiKy(),sv.getDiemKhac(),sv.getTongDiem(),sv.getDiemMm(),sv.getLyDo(),sv.getTinhTrang()});
            
        }
        this.tbDanhSachYeuCau.setModel(dtm);
        this.tbDanhSachYeuCau.repaint();
        this.tbDanhSachYeuCau.revalidate();
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtMaMon = new javax.swing.JTextField();
        cbGK = new javax.swing.JCheckBox();
        cbCK = new javax.swing.JCheckBox();
        cbDK = new javax.swing.JCheckBox();
        cbTD = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLyDo = new javax.swing.JTextArea();
        txtDMM = new javax.swing.JTextField();
        btnGoiYeuCau = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDanhSachYeuCau = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMaLop = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Sinh viết Gởi Phúc Khảo Môn Học");

        jLabel2.setText("MSSV");

        jLabel3.setText("Họ Tên");

        jLabel4.setText("Môn");

        jLabel5.setText("Cột Điểm");

        jLabel6.setText("Điểm Mong Muốn");

        jLabel7.setText("Lý Do");

        txtMaSV.setEditable(false);

        txtHoTen.setEditable(false);

        cbGK.setText("GK");

        cbCK.setText("CK");
        cbCK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCKActionPerformed(evt);
            }
        });

        cbDK.setText("ĐK");

        cbTD.setText("TĐ");

        txtLyDo.setColumns(20);
        txtLyDo.setRows(5);
        jScrollPane1.setViewportView(txtLyDo);

        txtDMM.setToolTipText("Nhap so Diem mong muon");

        btnGoiYeuCau.setText("Gởi Yêu Cầu");
        btnGoiYeuCau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoiYeuCauActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");

        tbDanhSachYeuCau.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbDanhSachYeuCau);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Danh Sách Phúc Khảo Sinh Viên Đã Yêu Cầu");

        jLabel9.setText("MaLop");

        txtMaLop.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(38, 38, 38)
                                .addComponent(cbGK)
                                .addGap(18, 18, 18)
                                .addComponent(cbCK)
                                .addGap(18, 18, 18)
                                .addComponent(cbDK)
                                .addGap(18, 18, 18)
                                .addComponent(cbTD))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHoTen)
                                    .addComponent(txtMaMon, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(30, 30, 30)
                        .addComponent(txtDMM, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnGoiYeuCau)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(328, 328, 328))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(549, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbGK)
                            .addComponent(cbCK)
                            .addComponent(cbDK)
                            .addComponent(cbTD))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel7)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGoiYeuCau, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38))))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1296, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCKActionPerformed
    public  boolean kiemTra(){
        if(txtMaMon.getText().equals("")||txtLyDo.getText().equals("")||txtDMM.getText().equals("")){
            JOptionPane.showMessageDialog(cbCK,"Nhap DU THONG TIN");
            return false;
        }
        if(cbCK.isSelected()==false&&cbDK.isSelected()==false&&cbGK.isSelected()==false&&cbTD.isSelected()==false){
            JOptionPane.showMessageDialog(cbCK,"Nhap DU THONG TIN");
            return false;
        }
        return true;
    }
    private void btnGoiYeuCauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoiYeuCauActionPerformed
       if(!kiemTra()){
           return;
       }
        try {
            maLop=txtMaLop.getText();
            maMon=txtMaMon.getText();
            hoTen=txtHoTen.getText();
            Svphuckhao svpk=new Svphuckhao();
            SvphuckhaoId svpkID=new SvphuckhaoId();
            svpkID.setMaLop(maLop);
            svpkID.setMaMon(maMon);
            svpkID.setMaSv(maSV);

            svpk.setId(svpkID);
            svpk.setHoTen(hoTen);
            if(cbGK.isSelected()){
                svpk.setGiuaKy("1");
            }else{
                svpk.setGiuaKy("0");
            }
            if(cbCK.isSelected()){
                svpk.setCuoiKy(1);
            }else{
                svpk.setCuoiKy(0);
            }
            if(cbDK.isSelected()){
                svpk.setDiemKhac(1);
            }else{
                svpk.setDiemKhac(0);
            }
            if(cbTD.isSelected()){
                svpk.setTongDiem(1);
            }else{
                svpk.setTongDiem(0);
            }
            try{
                svpk.setDiemMm(Float.parseFloat(txtDMM.getText()));
            }catch(Exception e){
                JOptionPane.showMessageDialog(cbCK,"diem la mot con so ");
            }
            svpk.setLyDo(txtLyDo.getText());
            svpk.setTinhTrang("Chua Xem");

            qlpkDAO.add(svpk);
            loadData();
            JOptionPane.showMessageDialog(cbCK,"Goi tao yeu cau Phuc Khao Thanh cong");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(cbCK,"Loi tao yeu cau Phuc Khao");
        }
    }//GEN-LAST:event_btnGoiYeuCauActionPerformed

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
            java.util.logging.Logger.getLogger(SVGoiPhucKhao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SVGoiPhucKhao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SVGoiPhucKhao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SVGoiPhucKhao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoiYeuCau;
    private javax.swing.JCheckBox cbCK;
    private javax.swing.JCheckBox cbDK;
    private javax.swing.JCheckBox cbGK;
    private javax.swing.JCheckBox cbTD;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbDanhSachYeuCau;
    private javax.swing.JTextField txtDMM;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextArea txtLyDo;
    private javax.swing.JTextField txtMaLop;
    private javax.swing.JTextField txtMaMon;
    private javax.swing.JTextField txtMaSV;
    // End of variables declaration//GEN-END:variables
}
