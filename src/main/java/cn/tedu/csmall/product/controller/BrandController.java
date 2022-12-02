package cn.tedu.csmall.product.controller;

import cn.tedu.csmall.product.ex.ServiceException;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Range;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@Api(tags = "01. 品牌管理模块")
@RestController
@RequestMapping("/brand")
@Validated
public class BrandController {

    public BrandController() {
        log.info("创建控制器对象：BrandController");
    }

    // http://localhost:8080/category/add-new
    @ApiOperation("添加类别")
    @ApiOperationSupport(order = 100)
    @PostMapping("/add-new")
    public void addNew() {
    }

    // http://localhost:9080/brand/delete
    @ApiOperation("删除品牌")
    @ApiOperationSupport(order = 200)
    @ApiImplicitParam(name = "id", value = "品牌ID", required = true, dataType = "long")
    @PostMapping("/delete")
    public void delete(@Range(min = 1,message = "刪除品牌無效，嘗試刪除的品牌ID無效") @RequestParam Long id) {
    }
}
