package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.SkuSpecification;
import org.springframework.stereotype.Repository;

@Repository
public interface SkuSpecificationMapper {
    int insert(SkuSpecification skuSpecification);
}
