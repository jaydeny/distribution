package com.zmc.entity;

public class Admin {
    private String adminId;

    private String adminName;

    private Integer adminSex;

    private Integer adminStatus;

    private String adminCity;

    private String adminAddr;

    private String adminPwd;

    private String adminTel;

    private String adminCom;

    private String roleId;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public Integer getAdminSex() {
        return adminSex;
    }

    public void setAdminSex(Integer adminSex) {
        this.adminSex = adminSex;
    }

    public Integer getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(Integer adminStatus) {
        this.adminStatus = adminStatus;
    }

    public String getAdminCity() {
        return adminCity;
    }

    public void setAdminCity(String adminCity) {
        this.adminCity = adminCity == null ? null : adminCity.trim();
    }

    public String getAdminAddr() {
        return adminAddr;
    }

    public void setAdminAddr(String adminAddr) {
        this.adminAddr = adminAddr == null ? null : adminAddr.trim();
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd == null ? null : adminPwd.trim();
    }

    public String getAdminTel() {
        return adminTel;
    }

    public void setAdminTel(String adminTel) {
        this.adminTel = adminTel == null ? null : adminTel.trim();
    }

    public String getAdminCom() {
        return adminCom;
    }

    public void setAdminCom(String adminCom) {
        this.adminCom = adminCom == null ? null : adminCom.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }
}