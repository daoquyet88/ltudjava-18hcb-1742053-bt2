package doan_hibernate_qlsv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entities.*;
import DAO.*;
/**
 *
 * @author Admin
 */

public class BangDiemSVWindow extends javax.swing.JPanel {

    /**
     * Creates new form SinhVienWindow
     */
    String maDangNhap="";
    BangDiemDAO bdDAO=new BangDiemDAO();
    public BangDiemSVWindow( ) throws IOException {
        initComponents();
        
    }
    public BangDiemSVWindow(String ma) throws IOException {
        initComponents();
        maDangNhap=ma;
        load();
        //JOptionPane.showMessageDialog(this,maDangNhap);
    }
    
    public void load() throws IOException{
       loadData();
    }
     private void loadData()
    {
        DefaultTableModel dtm=new DefaultTableModel();
        dtm.addColumn("STT");
        dtm.addColumn("Ma Lop");
        dtm.addColumn("Ma Mon");
        dtm.addColumn("Ma SV");
        dtm.addColumn("Ho Ten");
        dtm.addColumn("Diem GK");
        dtm.addColumn("Diem CK");
        dtm.addColumn("Diem Khac");
        dtm.addColumn("Diem Tong");
       
        for(entities.Bangdiem bd: this.bdDAO.loadBangDiemSV(maDangNhap))
        {
            dtm.addRow(new Object[]{bd.getStt(),bd.getId().getMaLop(),bd.getId().getMaMon(),bd.getId().getMaSv(),bd.getHoTen(),bd.getGk(),bd.getCk(),bd.getKhac(),bd.getTongDiem()});
            
        }
        this.tbBangDiem.setModel(dtm);
        this.tbBangDiem.repaint();
        this.tbBangDiem.revalidate();
    }
    
    public void loadcb1(String p) throws FileNotFoundException, IOException{
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBangDiem = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Bảng Điểm Của Sinh Viên");

        tbBangDiem.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbBangDiem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(405, 405, 405)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(454, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbBangDiem;
    // End of variables declaration//GEN-END:variables
}