package cn.edu.xmu.restfuldemo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 商品规格
 * @author Ming Qiu
 **/
@Data
@ApiModel(description = "商品规格")
public class Product {

    @ApiModelProperty(value = "规格id")
    private Integer id;

    @ApiModelProperty(value = "规格序号", example = "1-2-3")
    private String productSn;

    @ApiModelProperty(value = "描述")
    private String desc;

    @ApiModelProperty(value = "商品id")
    private Integer goodsId;

    @ApiModelProperty(value = "促销价")
    private Integer counterPrice;

    @ApiModelProperty(value = "零售价")
    private Integer retailPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCounterPrice() {
        return counterPrice;
    }

    public void setCounterPrice(Integer counterPrice) {
        this.counterPrice = counterPrice;
    }

    public Integer getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Integer retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Boolean getBeOnSale() {
        return beOnSale;
    }

    public void setBeOnSale(Boolean beOnSale) {
        this.beOnSale = beOnSale;
    }

    @ApiModelProperty(value = "库存量")
    private Integer stock;

    @ApiModelProperty(value = "重量(克)")
    private Integer weight;

    @ApiModelProperty(value ="是否上架")
    private Boolean beOnSale;

}
