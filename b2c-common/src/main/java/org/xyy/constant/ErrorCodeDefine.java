package org.xyy.constant;

/**
 * Author :chenqisheng
 * Date   :15/3/30.
 */
public enum ErrorCodeDefine {
    //通用错误
    DEFAULT_ERROR(100, "默认错误"),
    RECORD_NOT_EXISTS(101, "记录不存在"),
    PARAMS_FORM_NOT_VALID(102, "参数表单不合法"),
    UNAUTHORIZED(103, "权限不足"),

    PRODUCT_NOT_FOUND(1001, "商品找不到了"),

    OPERATION_NOT_SUPPORT(403, "操作类型不支持");

    private int code;
    private String desc;

    private ErrorCodeDefine(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
