package cn.tedu.csmall.product.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "02. 类别管理模块")
@RestController
@RequestMapping("/category")
public class CategoryController {

    // http://localhost:8080/category/add-new
    @ApiOperation("添加类别")
    @ApiOperationSupport(order = 100)
    @PostMapping("/add-new")
    public void addNew() {}

    // http://localhost:8080/category/delete
    @ApiOperation("删除类别")
    @ApiOperationSupport(order = 200)
    @ApiImplicitParams({
        @ApiImplicitParam(name = "id" , value = "類別id", required = true, dataType = "long",example = "9999"),
        @ApiImplicitParam(name = "userId" , value = "用戶ID", required = false, dataType = "long",example = "7777")
    })

    @PostMapping("/delete")
    public void delete(Long id,Long userId) {}

    // http://localhost:8080/category/update
    @ApiOperation("修改类别详情")
    @ApiOperationSupport(order = 300)
    @PostMapping("/update")
    public void update() {}

    // http://localhost:8080/category/get
    @ApiOperation("根据id查询类别详情")
    @ApiOperationSupport(order = 400)
    @PostMapping("/get")
    public void getStandardById() {}

    // http://localhost:8080/category/list
    @ApiOperation("查询类别列表")
    @ApiOperationSupport(order = 410)
    @PostMapping("/list")
    public void list() {}

}
