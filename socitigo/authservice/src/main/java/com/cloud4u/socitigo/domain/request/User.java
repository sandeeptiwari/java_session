package com.cloud4u.socitigo.domain.request;

public class User {
    private String name;
    private String mobileNo;
    private String password;
    private Long orgId;
    private String roll;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }
}
