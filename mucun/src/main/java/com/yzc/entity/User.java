package com.yzc.entity;

public class User {
    private String UserID;
    private String UserName;
    private String UserPsa;
    private String Type;
    private String UserTel;
    private String UserRmk;

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

    public String getUserPsa() {
        return UserPsa;
    }

    public void setUserPsa(String userPsa) {
        UserPsa = userPsa;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getUserTel() {
        return UserTel;
    }

    public void setUserTel(String userTel) {
        UserTel = userTel;
    }

    public String getUserRmk() {
        return UserRmk;
    }

    public void setUserRmk(String userRmk) {
        UserRmk = userRmk;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserID='" + UserID + '\'' +
                ", UserName='" + UserName + '\'' +
                ", UserPsa='" + UserPsa + '\'' +
                ", Type='" + Type + '\'' +
                ", UserTel='" + UserTel + '\'' +
                ", UserRmk='" + UserRmk + '\'' +
                '}';
    }
}
