package cn.tedu.csmall.product;

import cn.tedu.csmall.product.pojo.entity.Album;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class Jsd0804CsmallProductApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    DataSource dataSource;

    @Test
    void getConnection() throws SQLException {
        dataSource.getConnection();
    }

    @Test
    void data(){
        Album a = new Album();
        a.setName("jogging");
        a.getName();
    }

}
