package entities;
// Generated Aug 23, 2019 10:11:20 PM by Hibernate Tools 4.3.1



/**
 * BangdiemId generated by hbm2java
 */
public class BangdiemId  implements java.io.Serializable {


     private String maLop;
     private String maMon;
     private String maSv;

    public BangdiemId() {
    }

    public BangdiemId(String maLop, String maMon, String maSv) {
       this.maLop = maLop;
       this.maMon = maMon;
       this.maSv = maSv;
    }
   
    public String getMaLop() {
        return this.maLop;
    }
    
    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }
    public String getMaMon() {
        return this.maMon;
    }
    
    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }
    public String getMaSv() {
        return this.maSv;
    }
    
    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BangdiemId) ) return false;
		 BangdiemId castOther = ( BangdiemId ) other; 
         
		 return ( (this.getMaLop()==castOther.getMaLop()) || ( this.getMaLop()!=null && castOther.getMaLop()!=null && this.getMaLop().equals(castOther.getMaLop()) ) )
 && ( (this.getMaMon()==castOther.getMaMon()) || ( this.getMaMon()!=null && castOther.getMaMon()!=null && this.getMaMon().equals(castOther.getMaMon()) ) )
 && ( (this.getMaSv()==castOther.getMaSv()) || ( this.getMaSv()!=null && castOther.getMaSv()!=null && this.getMaSv().equals(castOther.getMaSv()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getMaLop() == null ? 0 : this.getMaLop().hashCode() );
         result = 37 * result + ( getMaMon() == null ? 0 : this.getMaMon().hashCode() );
         result = 37 * result + ( getMaSv() == null ? 0 : this.getMaSv().hashCode() );
         return result;
   }   


}


