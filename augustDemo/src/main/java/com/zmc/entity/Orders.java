package com.zmc.entity;

public class Orders {
    private String orderId;

    private Integer orderType;

    private String deliveryId;

    private String goodsName;

    private Integer goodsWeight;

    private String postName;

    private String postAddr;

    private String postTel;

    private String getName;

    private String getTel;

    private String getAddr;

    private Integer orderStatus;

    private String startCity;

    private String midCity;

    private String endCity;

    private Long transtPrice;

    private Long distributPrice;

    private String totalPrice;

    private String carId;

    private String orderCom;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId == null ? null : deliveryId.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(Integer goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName == null ? null : postName.trim();
    }

    public String getPostAddr() {
        return postAddr;
    }

    public void setPostAddr(String postAddr) {
        this.postAddr = postAddr == null ? null : postAddr.trim();
    }

    public String getPostTel() {
        return postTel;
    }

    public void setPostTel(String postTel) {
        this.postTel = postTel == null ? null : postTel.trim();
    }

    public String getGetName() {
        return getName;
    }

    public void setGetName(String getName) {
        this.getName = getName == null ? null : getName.trim();
    }

    public String getGetTel() {
        return getTel;
    }

    public void setGetTel(String getTel) {
        this.getTel = getTel == null ? null : getTel.trim();
    }

    public String getGetAddr() {
        return getAddr;
    }

    public void setGetAddr(String getAddr) {
        this.getAddr = getAddr == null ? null : getAddr.trim();
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity == null ? null : startCity.trim();
    }

    public String getMidCity() {
        return midCity;
    }

    public void setMidCity(String midCity) {
        this.midCity = midCity == null ? null : midCity.trim();
    }

    public String getEndCity() {
        return endCity;
    }

    public void setEndCity(String endCity) {
        this.endCity = endCity == null ? null : endCity.trim();
    }

    public Long getTranstPrice() {
        return transtPrice;
    }

    public void setTranstPrice(Long transtPrice) {
        this.transtPrice = transtPrice;
    }

    public Long getDistributPrice() {
        return distributPrice;
    }

    public void setDistributPrice(Long distributPrice) {
        this.distributPrice = distributPrice;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice == null ? null : totalPrice.trim();
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    public String getOrderCom() {
        return orderCom;
    }

    public void setOrderCom(String orderCom) {
        this.orderCom = orderCom == null ? null : orderCom.trim();
    }
}