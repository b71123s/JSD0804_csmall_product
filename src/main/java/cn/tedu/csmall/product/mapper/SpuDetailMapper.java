package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.SpuDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface SpuDetailMapper {
    int insert(SpuDetail spudetail);
}
