package entities;
// Generated Aug 24, 2019 9:39:23 AM by Hibernate Tools 4.3.1



/**
 * Svphuckhao generated by hbm2java
 */
public class Svphuckhao  implements java.io.Serializable {


     private SvphuckhaoId id;
     private int stt;
     private String hoTen;
     private String giuaKy;
     private float cuoiKy;
     private float diemKhac;
     private float tongDiem;
     private float diemMm;
     private String lyDo;
     private String tinhTrang;

    public Svphuckhao() {
    }

    public Svphuckhao(SvphuckhaoId id, int stt, String hoTen, String giuaKy, float cuoiKy, float diemKhac, float tongDiem, float diemMm, String lyDo, String tinhTrang) {
       this.id = id;
       this.stt = stt;
       this.hoTen = hoTen;
       this.giuaKy = giuaKy;
       this.cuoiKy = cuoiKy;
       this.diemKhac = diemKhac;
       this.tongDiem = tongDiem;
       this.diemMm = diemMm;
       this.lyDo = lyDo;
       this.tinhTrang = tinhTrang;
    }
   
    public SvphuckhaoId getId() {
        return this.id;
    }
    
    public void setId(SvphuckhaoId id) {
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
    public String getGiuaKy() {
        return this.giuaKy;
    }
    
    public void setGiuaKy(String giuaKy) {
        this.giuaKy = giuaKy;
    }
    public float getCuoiKy() {
        return this.cuoiKy;
    }
    
    public void setCuoiKy(float cuoiKy) {
        this.cuoiKy = cuoiKy;
    }
    public float getDiemKhac() {
        return this.diemKhac;
    }
    
    public void setDiemKhac(float diemKhac) {
        this.diemKhac = diemKhac;
    }
    public float getTongDiem() {
        return this.tongDiem;
    }
    
    public void setTongDiem(float tongDiem) {
        this.tongDiem = tongDiem;
    }
    public float getDiemMm() {
        return this.diemMm;
    }
    
    public void setDiemMm(float diemMm) {
        this.diemMm = diemMm;
    }
    public String getLyDo() {
        return this.lyDo;
    }
    
    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }
    public String getTinhTrang() {
        return this.tinhTrang;
    }
    
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }




}


