package com.zmc.entity;

public class Distributionarea {
    private Integer disAreaId;

    private String disAreaName;

    private Long disPrice;

    private String cityId;

    private String disCom;

    public Integer getDisAreaId() {
        return disAreaId;
    }

    public void setDisAreaId(Integer disAreaId) {
        this.disAreaId = disAreaId;
    }

    public String getDisAreaName() {
        return disAreaName;
    }

    public void setDisAreaName(String disAreaName) {
        this.disAreaName = disAreaName == null ? null : disAreaName.trim();
    }

    public Long getDisPrice() {
        return disPrice;
    }

    public void setDisPrice(Long disPrice) {
        this.disPrice = disPrice;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public String getDisCom() {
        return disCom;
    }

    public void setDisCom(String disCom) {
        this.disCom = disCom == null ? null : disCom.trim();
    }
}