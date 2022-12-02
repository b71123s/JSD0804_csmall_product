package cn.tedu.csmall.product.web;


/**
 * 業務狀態碼
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
public enum ServiceCode {
    // 枚舉
    OK(200),
    ERR_BAD_REQUEST(400),
    ERR_NOT_FOUND(404),
    ERR_CONFLICT(409);

    private Integer value;

    ServiceCode(Integer value){
      this.value = value;
    }

    public Integer getValue(){
        return value;
    }
}

