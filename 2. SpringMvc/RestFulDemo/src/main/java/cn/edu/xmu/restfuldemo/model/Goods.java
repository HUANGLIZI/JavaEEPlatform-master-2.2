package cn.edu.xmu.restfuldemo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@ApiModel(description = "商品")
public class Goods {

    @ApiModelProperty(value = "商品id")
    private Integer id;

    @ApiModelProperty(value = "商品编号")
    private String goodsSn;

    @ApiModelProperty(value = "商品名称")
    private String name;

    @ApiModelProperty(value = "类别id")
    private Integer categoryId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public List<Specification> getSpecList() {
        return specList;
    }

    public void setSpecList(List<Specification> specList) {
        this.specList = specList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Boolean getBeOnSale() {
        return beOnSale;
    }

    public void setBeOnSale(Boolean beOnSale) {
        this.beOnSale = beOnSale;
    }

    public LocalDateTime getAddTime() {
        return addTime;
    }

    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getModiUser() {
        return modiUser;
    }

    public void setModiUser(String modiUser) {
        this.modiUser = modiUser;
    }

    @ApiModelProperty(value = "品牌id")
    private Integer brandId;

    @ApiModelProperty(value = "商品描述")
     private String brief;

    @ApiModelProperty(value = "商品可选规格")
    private List<Specification> specList;

    @ApiModelProperty(value = "商品规格")
    private List<Product> productList;

    @ApiModelProperty(value = "图片url")
    private String picUrl;

    @ApiModelProperty(value = "单位")
    private String unit;

    @ApiModelProperty(value ="是否上架")
    private Boolean beOnSale;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime addTime;

    @ApiModelProperty(value = "最后一次修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "修改者")
    private String modiUser;
}