package com.thinkgem.jeesite.modules.wx.entity;

import java.io.Serializable;

public class Order2Food implements Serializable {

    private static final long serialVersionUID = -3078069398037132040L;

    private String id;
    private String orderId;
    private String foodId;
    private String foodName;
    private int foodCount;
    private double foodPrice;
    private String foodCategoryId;
    private String FoodCategoryName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodCategoryId() {
        return foodCategoryId;
    }

    public void setFoodCategoryId(String foodCategoryId) {
        this.foodCategoryId = foodCategoryId;
    }

    public String getFoodCategoryName() {
        return FoodCategoryName;
    }

    public void setFoodCategoryName(String foodCategoryName) {
        FoodCategoryName = foodCategoryName;
    }
}
