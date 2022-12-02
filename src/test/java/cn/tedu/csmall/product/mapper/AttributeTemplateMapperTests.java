package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.AttributeTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AttributeTemplateMapperTests {
    @Autowired
    AttributeTemplateMapper mapper;

    @Test
    void insert(){
        AttributeTemplate a = new AttributeTemplate();
        a.setName("測是喔");
        a.setPinyin("this is a test");
        int rows = mapper.insert(a);
        System.out.println(rows);
    }

}
