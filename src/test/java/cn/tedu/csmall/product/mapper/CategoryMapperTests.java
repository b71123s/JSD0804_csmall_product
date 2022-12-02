package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CategoryMapperTests {
    @Autowired
    CategoryMapper mapper;
    @Test
    void insert(){
        Category c = new Category();
        c.setDepth(13);
        c.setIsParent(2);
        mapper.insert(c);
    }
}
