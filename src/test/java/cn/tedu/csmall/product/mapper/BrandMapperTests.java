package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Brand;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;

@SpringBootTest
public class BrandMapperTests {
    @Autowired
    BrandMapper mapper;

    @Test
    void insert(){
        Brand b = new Brand();
        b.setLogo("goog to eat");
        b.setSort(1);
        b.setPositiveCommentCount(99);
        mapper.insert(b);
    }
}
