package com.yzc.entity;

public class Customer {
    private String CTID;
    private String CTName;
    private String CTType;
    private String CTpv;
    private String CTcity;
    private String CTaddress;
    private String CTCPname;
    private String CTTel;
    private String CTRmk;

    public String getCTID() {
        return CTID;
    }

    public void setCTID(String CTID) {
        this.CTID = CTID;
    }

    public String getCTName() {
        return CTName;
    }

    public void setCTName(String CTName) {
        this.CTName = CTName;
    }

    public String getCTType() {
        return CTType;
    }

    public void setCTType(String CTType) {
        this.CTType = CTType;
    }

    public String getCTpv() {
        return CTpv;
    }

    public void setCTpv(String CTpv) {
        this.CTpv = CTpv;
    }

    public String getCTcity() {
        return CTcity;
    }

    public void setCTcity(String CTcity) {
        this.CTcity = CTcity;
    }

    public String getCTaddress() {
        return CTaddress;
    }

    public void setCTaddress(String CTaddress) {
        this.CTaddress = CTaddress;
    }

    public String getCTCPname() {
        return CTCPname;
    }

    public void setCTCPname(String CTCPname) {
        this.CTCPname = CTCPname;
    }

    public String getCTTel() {
        return CTTel;
    }

    public void setCTTel(String CTTel) {
        this.CTTel = CTTel;
    }

    public String getCTRmk() {
        return CTRmk;
    }

    public void setCTRmk(String CTRmk) {
        this.CTRmk = CTRmk;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CTID='" + CTID + '\'' +
                ", CTName='" + CTName + '\'' +
                ", CTType='" + CTType + '\'' +
                ", CTpv='" + CTpv + '\'' +
                ", CTcity='" + CTcity + '\'' +
                ", CTaddress='" + CTaddress + '\'' +
                ", CTCPname='" + CTCPname + '\'' +
                ", CTTel='" + CTTel + '\'' +
                ", CTRmk='" + CTRmk + '\'' +
                '}';
    }
}
