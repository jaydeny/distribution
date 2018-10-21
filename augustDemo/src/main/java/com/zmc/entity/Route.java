package com.zmc.entity;

public class Route {
    private String routeId;

    private String routeName;

    private String startProId;

    private String startCityId;

    private String midProId;

    private String midCityId;

    private String endProId;

    private String endCityId;

    private Long transtPrice;

    private String routeCom;

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId == null ? null : routeId.trim();
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName == null ? null : routeName.trim();
    }

    public String getStartProId() {
        return startProId;
    }

    public void setStartProId(String startProId) {
        this.startProId = startProId == null ? null : startProId.trim();
    }

    public String getStartCityId() {
        return startCityId;
    }

    public void setStartCityId(String startCityId) {
        this.startCityId = startCityId == null ? null : startCityId.trim();
    }

    public String getMidProId() {
        return midProId;
    }

    public void setMidProId(String midProId) {
        this.midProId = midProId == null ? null : midProId.trim();
    }

    public String getMidCityId() {
        return midCityId;
    }

    public void setMidCityId(String midCityId) {
        this.midCityId = midCityId == null ? null : midCityId.trim();
    }

    public String getEndProId() {
        return endProId;
    }

    public void setEndProId(String endProId) {
        this.endProId = endProId == null ? null : endProId.trim();
    }

    public String getEndCityId() {
        return endCityId;
    }

    public void setEndCityId(String endCityId) {
        this.endCityId = endCityId == null ? null : endCityId.trim();
    }

    public Long getTranstPrice() {
        return transtPrice;
    }

    public void setTranstPrice(Long transtPrice) {
        this.transtPrice = transtPrice;
    }

    public String getRouteCom() {
        return routeCom;
    }

    public void setRouteCom(String routeCom) {
        this.routeCom = routeCom == null ? null : routeCom.trim();
    }
}