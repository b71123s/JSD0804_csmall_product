package cn.tedu.csmall.product.pojo.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AttributeTemplate {
    private Long id;
    private String name;
    private String pinyin;
    private String keywords;
    private Integer sort;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
}
