package cn.tedu.csmall.product.controller;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.pojo.dto.AlbumAddNewDTO;
import cn.tedu.csmall.product.pojo.entity.Album;
import cn.tedu.csmall.product.server.IAlbumService;
import cn.tedu.csmall.product.web.JsonResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Api(tags = "相册管理模块")
@RestController
@RequestMapping("/album")
public class AlbumController {

    @Autowired
    private IAlbumService albumService;

    // http://localhost:8080/album/add-new?name=TestAlbum001&description=TestDescription001&sort=66
    @PostMapping("/add-new")
    public JsonResult addNew(@Valid AlbumAddNewDTO albumAddNewDTO){
        albumService.addNew(albumAddNewDTO);

//        JsonResult jsonResult = new JsonResult();
//        jsonResult.setState(1);
//        jsonResult.setMessage("添加相簿成功!");
//        return jsonResult;

//        return new JsonResult().setState(1).setMessage("添加相簿成功!");
        return JsonResult.ok();
    }





}
