package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.BrandCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BrandCategoryMapperTests {
    @Autowired
    BrandCategoryMapper mapper;

    @Test
    void insert(){
        BrandCategory b = new BrandCategory();
        b.setBrandId(777L);
        b.setCategoryId(123L);
        int rows = mapper.insert(b);
        System.out.println("總共影響了"+rows+"行");
    }
}
