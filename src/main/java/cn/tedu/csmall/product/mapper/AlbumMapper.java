package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Album;
import cn.tedu.csmall.product.pojo.vo.AlbumListItemVO;
import cn.tedu.csmall.product.pojo.vo.AlbumStandardVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumMapper {

    int insert(Album album);

    int insertBatch(List<Album> albumList);

    int deleteById(Long id);

    int deleteByIds(Long[] ids);

    int update(Album album);

    int count();

    int countByName(String name);

    /**
     * 根据id查询相册详情
     *
     * @param id 相册id
     * @return 匹配的相册详情，如果没有匹配的数据，则返回null
     */
    AlbumStandardVO getStandardById(Long id);

    /**
     * 查询相册列表
     *
     * @return 相册列表
     */
    List<AlbumListItemVO> list();
}
