package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.CategoryAttributeTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CategoryAttributeTemplateMapperTests {
    @Autowired
    CategoryAttributeTemplateMapper mapper;

    @Test
    void insert(){
        CategoryAttributeTemplate c = new CategoryAttributeTemplate();
        c.setCategoryId(5L);
        c.setAttributeTemplateId(7L);
        mapper.insert(c);
    }


}
