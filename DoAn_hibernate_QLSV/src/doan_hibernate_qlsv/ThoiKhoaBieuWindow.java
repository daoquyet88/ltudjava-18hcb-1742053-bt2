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
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Admin
 */
public class ThoiKhoaBieuWindow extends javax.swing.JPanel {

    /**
     * Creates new form ThoiKhoaBieuWindow
     */
    String path="";
    public ThoiKhoaBieuWindow() throws IOException {
        initComponents();
        load();
    }
    public void load() throws IOException{
         String file="D:\\File CSV\\dslop.csv";
         docFileLH(file);
         File f=new File(file);
        String nameFile=f.getName();
        lbThongBao.setText("Thông Tin Môn Học Lớp : "+nameFile);
       
    }
    public void taoFileLopMH(String p) throws UnsupportedEncodingException, FileNotFoundException, IOException{
//        String tenLop="";
//        File fileDir = new File(p);			
//        BufferedReader br = new BufferedReader(
//           new InputStreamReader(
//              new FileInputStream(fileDir), "UTF8"));  
//        String [] dt;
//        dt=p.split("\\_");
//        tenLop=dt[0].toString();
//        String fileOld=dt[0].toString()+".csv";
//        Path cu=Paths.get(fileOld);
//        String []dataSV;
//        String line = br.readLine();    
//        line = br.readLine();
//        String fileNew="";
//        String tf="";
//        Path moi;
//          while(line != null){              
//              dataSV=line.split(",");
//              fileNew=tenLop+"_"+dataSV[1]+".csv";
//              moi=Paths.get(fileNew);              
//              copyFile(cu,moi);            
//              
//              line =br.readLine();
//          }
//        br.close();
//        //fr.close();
//        
//    
        
    }
    public void docFileLH(String p) throws FileNotFoundException, IOException{
       
        File fileDir = new File(p);
			
		BufferedReader br = new BufferedReader(
		   new InputStreamReader(
                      new FileInputStream(fileDir), "UTF8"));     
        String []dataSV;
        String line = br.readLine();      
          
        line = br.readLine();
          while(line != null){
              dataSV=line.split(",");
              cbLop.addItem(dataSV[0]);
              line =br.readLine();
          }
        br.close();
        //fr.close();
        
    }
//    public void load() throws IOException{
//          String file="C:\\Users\\Admin\\Desktop\\File CSV\\17hcb_tkb.csv";
//          docFile(file);
//          File f=new File(file);
//        String nameFile=f.getName();
//        lbThongBao.setText("Thông Tin Danh Sách Sinh Viên Lớp : "+nameFile);
//    }
    public void docFile(String p) throws FileNotFoundException, IOException{
        DefaultTableModel dtm=new DefaultTableModel();       
         
        File fileDir = new File(p);
			
		BufferedReader br = new BufferedReader(
		   new InputStreamReader(
                      new FileInputStream(fileDir), "UTF8"));
        String [] NameSV;
        String []dataSV;
        String line = br.readLine();
        NameSV=line.split(",");
        for(int i=0;i<NameSV.length;i++){
            dtm.addColumn(String.valueOf(NameSV[i]));
        }         
        line = br.readLine();
          while(line != null){
              dataSV=line.split(",");
               dtm.addRow(new Object[]{dataSV[0],dataSV[1],dataSV[2],dataSV[3]});
              line =br.readLine();
          }
        br.close();
        //fr.close();
         this.tbTKB.setModel(dtm);
        this.tbTKB.repaint();
        this.tbTKB.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbThongBao = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnimport = new javax.swing.JButton();
        lbDuongDan = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTKB = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbLop = new javax.swing.JComboBox();

        setLayout(null);

        lbThongBao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbThongBao.setText("Thời Khoá Biểu Lớp Học ");
        add(lbThongBao);
        lbThongBao.setBounds(210, 20, 550, 30);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Chọn File Thời Khoá Biểu :");

        btnimport.setText("Import File ");
        btnimport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimportActionPerformed(evt);
            }
        });

        lbDuongDan.setText("Đường Dẫn");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btnimport, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbDuongDan)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(btnimport)
                .addGap(41, 41, 41)
                .addComponent(lbDuongDan)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        add(jPanel1);
        jPanel1.setBounds(10, 80, 310, 390);

        tbTKB.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbTKB);

        jLabel1.setText("Chọn Lớp ");

        cbLop.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbLopItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addComponent(cbLop, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel3);
        jPanel3.setBounds(340, 60, 640, 420);
    }// </editor-fold>//GEN-END:initComponents

    private void btnimportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimportActionPerformed
//////        
//////        JFileChooser file =new JFileChooser();
//////       file.setCurrentDirectory(new File(System.getProperty("user.home")));
//////       
//////       // FileNameExtensionFilter fileter=new FileNameExtensionFilter("*.images","jpg","png");
//////        //file.addChoosableFileFilter(fileter);
//////        int result=file.showSaveDialog(this);
//////        if(result==JFileChooser.APPROVE_OPTION)
//////        {
//////            File selectedFile=file.getSelectedFile();
//////            path=selectedFile.getAbsolutePath();
//////            //lbImg.setIcon(ResizeImage(path,null));
//////            lbDuongDan.setText(path);
//////        }
//////        else{
//////            System.out.println("NO file select");
//////        }
//////        
//////        try {
//////            // TODO add your handling code here:
//////               // TODO add your handling code here:
//////        String []data;
//////        String fileGoc="D:\\File CSV\\";
//////        File f=new File(path);
//////        String name=f.getName();
//////        data=name.split("\\.");
//////        String fileName=f.getName();
//////        String fileKT=fileGoc+fileName;
//////        File fKT=new  File(fileKT);
//////        if(fKT.exists()){
//////            JOptionPane.showMessageDialog(cbLop,"File Da ton tai");
//////        }
//////        else{
//////            JOptionPane.showMessageDialog(cbLop,"import Thành Công");
//////            Path source = Paths.get(path);
////// 
//////		// Destination file.
//////		Path destination = Paths.get(fileKT);
//////		
//////		try {
//////			copyFile(source, destination);
//////		} catch (IOException e) {
//////			System.out.println("Lỗi Khi copy File");
//////			e.printStackTrace();
//////		}
//////            docFile(fileKT);
//////            taoFileLopMH(fileKT);
//////        }
//////            
//////        } catch (IOException ex) {
//////            Logger.getLogger(DSSinhVienWindow.class.getName()).log(Level.SEVERE, null, ex);
//////        }
//////        File f=new File(path);
//////        String nameFile=f.getName();
//////        lbThongBao.setText("Thông Tin Danh Sách Sinh Viên Lớp : "+nameFile);
    }//GEN-LAST:event_btnimportActionPerformed

    private void cbLopItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbLopItemStateChanged
      
        if (cbLop.getSelectedItem() != null) {
            String name = cbLop.getSelectedItem().toString();
            String file = "D:\\File CSV\\" + name + "_TKB.csv";

            // JOptionPane.showMessageDialog(cbLop,file);
            try {
                docFile(file);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(cbLop, "Lop chua co thoi khoa bieu");
            }
        }

    }//GEN-LAST:event_cbLopItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnimport;
    private javax.swing.JComboBox cbLop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDuongDan;
    private javax.swing.JLabel lbThongBao;
    private javax.swing.JTable tbTKB;
    // End of variables declaration//GEN-END:variables
}
