package com.zmc.entity;

import java.util.Date;

public class Car {
    private String carId;

    private String carType;

    private String carDimension;

    private String routeId;

    private Date carBir;

    private Date buyDate;

    private String carCom;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }

    public String getCarDimension() {
        return carDimension;
    }

    public void setCarDimension(String carDimension) {
        this.carDimension = carDimension == null ? null : carDimension.trim();
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId == null ? null : routeId.trim();
    }

    public Date getCarBir() {
        return carBir;
    }

    public void setCarBir(Date carBir) {
        this.carBir = carBir;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public String getCarCom() {
        return carCom;
    }

    public void setCarCom(String carCom) {
        this.carCom = carCom == null ? null : carCom.trim();
    }
}