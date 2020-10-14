package cn.edu.xmu.restfuldemo.controller.vo;

import cn.edu.xmu.restfuldemo.model.Goods;
import cn.edu.xmu.restfuldemo.model.Product;
import cn.edu.xmu.restfuldemo.model.Specification;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * 商品视图对象
 * @author Ming Qiu
 **/
@Data
@ApiModel(description = "商品视图对象")
public class GoodsVo {

    @NotBlank(message="商品名称不能为空")
    @ApiModelProperty(value = "商品名称")
    private String name;

    @ApiModelProperty(value = "商品描述")
    private String brief;

    @ApiModelProperty(value = "商品单位")
    private String unit;

    @ApiModelProperty(value = "商品类别Id")
    private Integer categoryId;

    @ApiModelProperty(value = "商品品牌Id")
    private Integer brandId;

    @ApiModelProperty(value = "商品可选规格")
    private List<Specification> specList;

    @ApiModelProperty(value = "商品规格")
    private List<ProductVo> productList;

    /**
     * 由Vo对象创建Goods对象
     * @return Goods对象
     */
    public Goods createGoods(){
        Goods goods = new Goods();
        goods.setName(this.name);
        goods.setBrief(this.brief);
        goods.setUnit(this.unit);
        goods.setSpecList(this.specList);
        goods.setBrandId(this.brandId);
        goods.setCategoryId(this.categoryId);
        return goods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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

    public List<Specification> getSpecList() {
        return specList;
    }

    public void setSpecList(List<Specification> specList) {
        this.specList = specList;
    }

    public List<ProductVo> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductVo> productList) {
        this.productList = productList;
    }
}
