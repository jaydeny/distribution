package com.zmc.entity;

public class Distribution {
    private Integer distributId;

    private String distributName;

    private String proId;

    private String cityId;

    private String adminId;

    private String distributTel;

    private String distributAddr;

    private String distributCom;

    public Integer getDistributId() {
        return distributId;
    }

    public void setDistributId(Integer distributId) {
        this.distributId = distributId;
    }

    public String getDistributName() {
        return distributName;
    }

    public void setDistributName(String distributName) {
        this.distributName = distributName == null ? null : distributName.trim();
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId == null ? null : proId.trim();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    public String getDistributTel() {
        return distributTel;
    }

    public void setDistributTel(String distributTel) {
        this.distributTel = distributTel == null ? null : distributTel.trim();
    }

    public String getDistributAddr() {
        return distributAddr;
    }

    public void setDistributAddr(String distributAddr) {
        this.distributAddr = distributAddr == null ? null : distributAddr.trim();
    }

    public String getDistributCom() {
        return distributCom;
    }

    public void setDistributCom(String distributCom) {
        this.distributCom = distributCom == null ? null : distributCom.trim();
    }
}