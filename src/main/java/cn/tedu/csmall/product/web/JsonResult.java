package cn.tedu.csmall.product.web;

import cn.tedu.csmall.product.ex.ServiceException;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class JsonResult {
    private Integer state;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;

    public static JsonResult ok(){
        JsonResult jsonResult = new JsonResult();
        jsonResult.state = ServiceCode.OK.getValue();
        return jsonResult;
    }

    public static JsonResult fail(ServiceException e){
//        JsonResult jsonResult = new JsonResult();
//        jsonResult.state = serviceCode.getValue();
//        jsonResult.message = message;
//        return jsonResult;
        return fail(e.getServiceCode(), e.getMessage());
    }

    public static JsonResult fail(ServiceCode serviceCode,String message){
        JsonResult jsonResult = new JsonResult();
        jsonResult.state = serviceCode.getValue();
        jsonResult.message = message;
        return jsonResult;
    }
}
