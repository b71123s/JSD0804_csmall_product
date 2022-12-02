package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Album;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootTest
public class AlbumMapperTests {
    @Autowired
    AlbumMapper mapper;

    @Test
    void insert(){
        Album album = new Album();
        album.setName("測試");
        album.setDescription("測試數據的簡介");
        album.setSort(99); // 注意：sort值必须是[0, 255]之间的

        log.debug("插入数据之前，参数：{}", album);
        int rows = mapper.insert(album);
        log.debug("插入数据完成，受影响的行数：{}", rows);
        log.debug("插入数据之后，参数：{}", album);
    }

        @Test
        void insertBatch() {
            List<Album> albumList = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                Album album = new Album();
                album.setName("测试数据" + i);
                album.setDescription("测试数据的简介" + i);
                album.setSort(99);
                albumList.add(album);
            }

            int rows = mapper.insertBatch(albumList);
            log.debug("批量插入数据完成，受影响的行数：{}", rows);
        }

        @Test
        void deleteById () {
            Long id = 1L;
            int rows = mapper.deleteById(id);
            log.debug("删除数据完成，受影响的行数：{}", rows);
        }

        @Test
        void deleteByIds () {
            Long[] ids = {1L, 3L, 5L};
            int rows = mapper.deleteByIds(ids);
            log.debug("批量删除数据完成，受影响的行数：{}", rows);
        }



    @Test
    void update() {
        Album album = new Album();
        album.setId(1L);
        album.setName("【很新】测试数据");
        // album.setDescription("【新】测试数据的简介");
        // album.setSort(199);

        int rows = mapper.update(album);
        log.debug("修改数据完成，受影响的行数：{}", rows);
    }

    @Test
    void count() {
        int count = mapper.count();
        log.debug("统计完成，结果：{}", count);
    }

    @Test
    void countByName(){
        String name = "test";
        int count = mapper.countByName(name);
        log.debug("根据名称【{}】统计完成，结果：{}", name, count);
    }

    @Test
    void getStandardById() {
        Long id = 1L;
        Object queryResult = mapper.getStandardById(id);
        log.debug("根据ID【{}】查询完成，结果：{}", id, queryResult);
    }

    @Test
    void list() {
        List<?> list = mapper.list();
        log.debug("查询列表完成，结果中的数据的数量：{}", list.size());
        for (Object item : list) {
            log.debug("{}", item);
        }
    }




}
