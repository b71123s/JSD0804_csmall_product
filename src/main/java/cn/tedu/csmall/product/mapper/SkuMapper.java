package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Sku;
import org.springframework.stereotype.Repository;

@Repository
public interface SkuMapper {
    int insert(Sku sku);
}
