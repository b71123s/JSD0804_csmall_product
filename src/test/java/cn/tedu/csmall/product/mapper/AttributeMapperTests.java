package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Attribute;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootTest
public class AttributeMapperTests {
    @Autowired
    AttributeMapper mapper;

    @Test
    void insert(){
        Attribute a = new Attribute();
        a.setDescription("測試attribute");
        a.setName("測試名子");
        int rows = mapper.insert(a);
        System.out.println(rows);
    }

    @Test
    void insertBatch(){
        List<Attribute> attributes = new ArrayList<>();
        for (int i = 1;i <= 5;i++){
            Attribute attribute = new Attribute();
            attribute.setName("test"+i);

            attributes.add(attribute);
        }
        int rows = mapper.insertBatch(attributes);
        log.debug("批量數據插入完成，受影響行數 {} 行",rows);
    }

    @Test
    void deleteById(){
         Long id = 24L;
        int rows = mapper.deleteById(id);
        log.info("刪除數據完成，受影響行數 {} 行",rows);
    }

    @Test
    void deleteByIds(){

    }
}
