package com.example.demo.sq.entity;

public class SysRole {
    private Integer roleId;

    private String roleName;

    private String roleDes;

    private Integer rolePid;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDes() {
        return roleDes;
    }

    public void setRoleDes(String roleDes) {
        this.roleDes = roleDes == null ? null : roleDes.trim();
    }

    public Integer getRolePid() {
        return rolePid;
    }

    public void setRolePid(Integer rolePid) {
        this.rolePid = rolePid;
    }
}