package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Spu;
import org.springframework.stereotype.Repository;

@Repository
public interface SpuMapper {
    int insert(Spu spu);
}
