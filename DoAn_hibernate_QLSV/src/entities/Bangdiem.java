package entities;
// Generated Aug 23, 2019 10:11:20 PM by Hibernate Tools 4.3.1



/**
 * Bangdiem generated by hbm2java
 */
public class Bangdiem  implements java.io.Serializable {


     private BangdiemId id;
     private int stt;
     private String hoTen;
     private float gk;
     private float ck;
     private float khac;
     private float tongDiem;

    public Bangdiem() {
    }

    public Bangdiem(BangdiemId id, int stt, String hoTen, float gk, float ck, float khac, float tongDiem) {
       this.id = id;
       this.stt = stt;
       this.hoTen = hoTen;
       this.gk = gk;
       this.ck = ck;
       this.khac = khac;
       this.tongDiem = tongDiem;
    }
   
    public BangdiemId getId() {
        return this.id;
    }
    
    public void setId(BangdiemId id) {
        this.id = id;
    }
    public int getStt() {
        return this.stt;
    }
    
    public void setStt(int stt) {
        this.stt = stt;
    }
    public String getHoTen() {
        return this.hoTen;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public float getGk() {
        return this.gk;
    }
    
    public void setGk(float gk) {
        this.gk = gk;
    }
    public float getCk() {
        return this.ck;
    }
    
    public void setCk(float ck) {
        this.ck = ck;
    }
    public float getKhac() {
        return this.khac;
    }
    
    public void setKhac(float khac) {
        this.khac = khac;
    }
    public float getTongDiem() {
        return this.tongDiem;
    }
    
    public void setTongDiem(float tongDiem) {
        this.tongDiem = tongDiem;
    }




}


