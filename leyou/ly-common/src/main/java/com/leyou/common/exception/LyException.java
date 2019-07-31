package com.leyou.common.exception;

import com.leyou.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Auther: ShiTianhang
 * @Date: 2019/7/31 09:16
 * @Description:
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LyException extends RuntimeException {

    private ExceptionEnum exceptionEnum;


}
