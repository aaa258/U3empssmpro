package com.team.emp.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Emp {
    private Integer eid;

    private String ename;

    private String esex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date estartime;

    private Float epay;

    private Integer did;
    private String dname;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getEsex() {
        return esex;
    }

    public void setEsex(String esex) {
        this.esex = esex == null ? null : esex.trim();
    }

    public Date getEstartime() {
        return estartime;
    }

    public void setEstartime(Date estartime) {
        this.estartime = estartime;
    }

    public Float getEpay() {
        return epay;
    }

    public void setEpay(Float epay) {
        this.epay = epay;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
}