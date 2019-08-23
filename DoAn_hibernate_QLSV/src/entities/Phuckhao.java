package entities;
// Generated Aug 23, 2019 10:11:20 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Phuckhao generated by hbm2java
 */
public class Phuckhao  implements java.io.Serializable {


     private PhuckhaoId id;
     private int stt;
     private String tenMh;
     private Date ngayBatDau;
     private Date ngayHetHan;

    public Phuckhao() {
    }

    public Phuckhao(PhuckhaoId id, int stt, String tenMh, Date ngayBatDau, Date ngayHetHan) {
       this.id = id;
       this.stt = stt;
       this.tenMh = tenMh;
       this.ngayBatDau = ngayBatDau;
       this.ngayHetHan = ngayHetHan;
    }
   
    public PhuckhaoId getId() {
        return this.id;
    }
    
    public void setId(PhuckhaoId id) {
        this.id = id;
    }
    public int getStt() {
        return this.stt;
    }
    
    public void setStt(int stt) {
        this.stt = stt;
    }
    public String getTenMh() {
        return this.tenMh;
    }
    
    public void setTenMh(String tenMh) {
        this.tenMh = tenMh;
    }
    public Date getNgayBatDau() {
        return this.ngayBatDau;
    }
    
    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }
    public Date getNgayHetHan() {
        return this.ngayHetHan;
    }
    
    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }




}

