package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.SpuDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpuDetailMapperTests {
    @Autowired
    SpuDetailMapper mapper;

    @Test
    void insert(){
        SpuDetail s = new SpuDetail();
        s.setSpuId(11L);
        s.setDetail("this is a test!!!");
        System.out.println("影響行數: "+mapper.insert(s));
    }
}
