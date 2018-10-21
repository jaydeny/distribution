package com.zmc.entity;

import java.util.Date;

public class Delivery {
    private String deliveryId;

    private String startCity;

    private String endCity;

    private String midCity;

    private Integer status;

    private Date makeDate;

    private String deliverCom;

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId == null ? null : deliveryId.trim();
    }

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity == null ? null : startCity.trim();
    }

    public String getEndCity() {
        return endCity;
    }

    public void setEndCity(String endCity) {
        this.endCity = endCity == null ? null : endCity.trim();
    }

    public String getMidCity() {
        return midCity;
    }

    public void setMidCity(String midCity) {
        this.midCity = midCity == null ? null : midCity.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getMakeDate() {
        return makeDate;
    }

    public void setMakeDate(Date makeDate) {
        this.makeDate = makeDate;
    }

    public String getDeliverCom() {
        return deliverCom;
    }

    public void setDeliverCom(String deliverCom) {
        this.deliverCom = deliverCom == null ? null : deliverCom.trim();
    }
}