package cn.edu.xmu.restfuldemo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 商品的可选规格的项
 * @author Ming Qiu
 **/
@Data
@ApiModel(description = "商品的可选规格的项")
public class SpecItem {
    @ApiModelProperty(value = "规格可选项id")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @ApiModelProperty(value = "规格可选内容")
    private String content;
}
