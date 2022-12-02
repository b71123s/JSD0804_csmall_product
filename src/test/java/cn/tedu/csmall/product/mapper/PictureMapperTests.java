package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Picture;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PictureMapperTests {
    @Autowired
    PictureMapper mapper;

    @Test
    void insert(){
        Picture p = new Picture();
        p.setHeight(500);
        p.setUrl("/img");
        System.out.println("影響行數: "+mapper.insert(p));
    }
}
