package cn.tedu.csmall.product.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 添加相册的DTO类
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Data
public class AlbumAddNewDTO implements Serializable {

    /**
     * 相册名称
     */
    @ApiModelProperty("相簿名稱")
    @NotNull(message = "增加相簿失敗，必須輸入相簿名稱!")
    private String name;
    /**
     * 相册简介
     */
    @ApiModelProperty("相簿簡介")
    @NotNull(message = "增加相簿失敗，必須輸入相簿簡介!")
    private String description;
    /**
     * 排序序号
     */
    @ApiModelProperty("排序序號")
    @Range(max = 255)
    private Integer sort;

}
