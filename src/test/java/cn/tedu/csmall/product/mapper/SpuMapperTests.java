package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Spu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpuMapperTests {
    @Autowired
    SpuMapper mapper;
    @Test
    void insert(){
        Spu s = new Spu();
        s.setUnit("第六單元");
        s.setId(1L);
        s.setAttributeTemplateId(123L);
        System.out.println("影響行數: "+ mapper.insert(s));
    }
}
