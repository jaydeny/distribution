package com.zmc.entity;

import java.util.Date;

public class Client {
    private String clientId;

    private String clientName;

    private Integer clientSex;

    private String roleId;

    private String clientPwd;

    private String clientTel;

    private Date clientBir;

    private String clientAddr;

    private String clientCom;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    public Integer getClientSex() {
        return clientSex;
    }

    public void setClientSex(Integer clientSex) {
        this.clientSex = clientSex;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getClientPwd() {
        return clientPwd;
    }

    public void setClientPwd(String clientPwd) {
        this.clientPwd = clientPwd == null ? null : clientPwd.trim();
    }

    public String getClientTel() {
        return clientTel;
    }

    public void setClientTel(String clientTel) {
        this.clientTel = clientTel == null ? null : clientTel.trim();
    }

    public Date getClientBir() {
        return clientBir;
    }

    public void setClientBir(Date clientBir) {
        this.clientBir = clientBir;
    }

    public String getClientAddr() {
        return clientAddr;
    }

    public void setClientAddr(String clientAddr) {
        this.clientAddr = clientAddr == null ? null : clientAddr.trim();
    }

    public String getClientCom() {
        return clientCom;
    }

    public void setClientCom(String clientCom) {
        this.clientCom = clientCom == null ? null : clientCom.trim();
    }
}