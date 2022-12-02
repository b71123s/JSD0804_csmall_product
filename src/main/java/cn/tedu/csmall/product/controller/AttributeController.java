package cn.tedu.csmall.product.controller;

import cn.tedu.csmall.product.server.IAlbumService;
import cn.tedu.csmall.product.web.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/attribute")
public class AttributeController {

    @Autowired
    private IAlbumService albumService;

    @PostMapping("/add-new")
    public JsonResult addNew(){
        return JsonResult.ok();
    }

}
