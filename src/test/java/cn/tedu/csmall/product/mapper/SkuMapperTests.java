package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Sku;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SkuMapperTests {
    @Autowired
    SkuMapper mapper;

    @Test
    void insert(){
        Sku s = new Sku();
        s.setPictures("/imgs/a.jpg");
        s.setId(1L);
        s.setSales(99);
        System.out.println(mapper.insert(s));
    }
}
