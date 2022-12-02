package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Attribute;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttributeMapper {
    int insert(Attribute attribute);

    int insertBatch(List<Attribute> attributeList);

    int deleteById(Long id);

    int deleteByIds(Long[] ids);


}
