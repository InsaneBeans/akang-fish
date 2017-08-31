package com.fisher.domain.fisher;

import java.math.BigDecimal;

import org.apache.ibatis.type.Alias;

@Alias("goods")
public class Goods {

    private String id;
    private String name;
    private String nature;
    private BigDecimal price;
    private String remark;
    private String eatWays;
    private String picDirection;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getEatWays() {
        return eatWays;
    }

    public void setEatWays(String eatWays) {
        this.eatWays = eatWays;
    }

    public String getPicDirection() {
        return picDirection;
    }

    public void setPicDirection(String picDirection) {
        this.picDirection = picDirection;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }
    
}
