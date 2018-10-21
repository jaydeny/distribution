package com.zmc.entity;

public class Role {
    private String roleId;

    private String roleName;

    private String roleCom;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleCom() {
        return roleCom;
    }

    public void setRoleCom(String roleCom) {
        this.roleCom = roleCom == null ? null : roleCom.trim();
    }
}