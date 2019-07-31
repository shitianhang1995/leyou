package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Auther: ShiTianhang
 * @Date: 2019/7/31 09:10
 * @Description:
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {
    PRICE_CANNOT_BE_NULL(400,"价格不能为空!")
    ;
    private int code;
    private String msg;

}
