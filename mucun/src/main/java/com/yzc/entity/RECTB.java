package com.yzc.entity;

import java.util.Date;

public class RECTB {
    private String RecID;
    private String CTID;
    private String WorkID;
    private String Status;
    private Date StaTime;
    private String UserID;
    private String UserName;

    public String getRecID() {
        return RecID;
    }

    public void setRecID(String recID) {
        RecID = recID;
    }

    public String getCTID() {
        return CTID;
    }

    public void setCTID(String CTID) {
        this.CTID = CTID;
    }

    public String getWorkID() {
        return WorkID;
    }

    public void setWorkID(String workID) {
        WorkID = workID;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Date getStaTime() {
        return StaTime;
    }

    public void setStaTime(Date staTime) {
        StaTime = staTime;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    @Override
    public String toString() {
        return "RECTB{" +
                "RecID='" + RecID + '\'' +
                ", CTID='" + CTID + '\'' +
                ", WorkID='" + WorkID + '\'' +
                ", Status='" + Status + '\'' +
                ", StaTime=" + StaTime +
                ", UserID='" + UserID + '\'' +
                ", UserName='" + UserName + '\'' +
                '}';
    }
}
