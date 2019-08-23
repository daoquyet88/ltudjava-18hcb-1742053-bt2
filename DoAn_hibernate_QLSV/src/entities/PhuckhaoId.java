package entities;
// Generated Aug 23, 2019 10:11:20 PM by Hibernate Tools 4.3.1



/**
 * PhuckhaoId generated by hbm2java
 */
public class PhuckhaoId  implements java.io.Serializable {


     private String maLop;
     private String maMon;

    public PhuckhaoId() {
    }

    public PhuckhaoId(String maLop, String maMon) {
       this.maLop = maLop;
       this.maMon = maMon;
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


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PhuckhaoId) ) return false;
		 PhuckhaoId castOther = ( PhuckhaoId ) other; 
         
		 return ( (this.getMaLop()==castOther.getMaLop()) || ( this.getMaLop()!=null && castOther.getMaLop()!=null && this.getMaLop().equals(castOther.getMaLop()) ) )
 && ( (this.getMaMon()==castOther.getMaMon()) || ( this.getMaMon()!=null && castOther.getMaMon()!=null && this.getMaMon().equals(castOther.getMaMon()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getMaLop() == null ? 0 : this.getMaLop().hashCode() );
         result = 37 * result + ( getMaMon() == null ? 0 : this.getMaMon().hashCode() );
         return result;
   }   


}


