package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryMapper {
    int insert(Category category);
}
