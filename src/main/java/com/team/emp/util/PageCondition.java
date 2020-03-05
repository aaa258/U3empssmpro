package com.team.emp.util;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class PageCondition {
    private Integer page=1;
    private Integer pageSize=5;
    private String ename;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startestartime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endestartime;
    private Integer did;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Date getStartestartime() {
        return startestartime;
    }

    public void setStartestartime(Date startestartime) {
        this.startestartime = startestartime;
    }

    public Date getEndestartime() {
        return endestartime;
    }

    public void setEndestartime(Date endstartime) {
        this.endestartime = endstartime;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
}
