package cn.edu.xmu.restfuldemo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


import java.util.List;

/**
 * 商品的可选规格
 * @author Ming Qiu
 **/
@Data
@ApiModel(description = "商品的可选规格")
public class Specification {

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public List<SpecItem> getSpecItemList() {
        return specItemList;
    }

    public void setSpecItemList(List<SpecItem> specItemList) {
        this.specItemList = specItemList;
    }

    @ApiModelProperty(value = "规格名称")
    private String specName;

    @ApiModelProperty(value = "规格可选值")
    private List<SpecItem> specItemList;
}
