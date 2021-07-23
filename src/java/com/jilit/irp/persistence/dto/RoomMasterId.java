package com.jilit.irp.persistence.dto;
// Generated Dec 19, 2009 12:17:52 PM by Hibernate Tools 3.2.1.GA



/**
 * RoommasterId generated by hbm2java
 */
public class RoomMasterId  implements java.io.Serializable {


     private String instituteid;
     private String roomid;

    public RoomMasterId() {
    }

    public RoomMasterId(String instituteid, String roomid) {
       this.instituteid = instituteid;
       this.roomid = roomid;
    }
   
    public String getInstituteid() {
        return this.instituteid;
    }
    
    public void setInstituteid(String instituteid) {
        this.instituteid = instituteid;
    }
    public String getRoomid() {
        return this.roomid;
    }
    
    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RoomMasterId) ) return false;
		 RoomMasterId castOther = ( RoomMasterId ) other;
         
		 return ( (this.getInstituteid()==castOther.getInstituteid()) || ( this.getInstituteid()!=null && castOther.getInstituteid()!=null && this.getInstituteid().equals(castOther.getInstituteid()) ) )
 && ( (this.getRoomid()==castOther.getRoomid()) || ( this.getRoomid()!=null && castOther.getRoomid()!=null && this.getRoomid().equals(castOther.getRoomid()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getInstituteid() == null ? 0 : this.getInstituteid().hashCode() );
         result = 37 * result + ( getRoomid() == null ? 0 : this.getRoomid().hashCode() );
         return result;
   }   


}


