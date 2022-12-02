package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.SkuSpecification;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SkuSpecificationMapperTests {
    @Autowired
    SkuSpecificationMapper mapper;

    @Test
    void insert(){
        SkuSpecification s = new SkuSpecification();
        s.setAttributeValue("this");
        s.setAttributeId(789L);
        System.out.println("影響行數: "+mapper.insert(s));
    }
}
