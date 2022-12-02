package cn.tedu.csmall.product;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class Slf4jTests {
    @Test
    void test(){
        log.info("輸出一條日誌");
        log.debug("輸出了一條[ trsce 日誌");
    }
}
