package com.leyou.common.advice;

import com.leyou.common.exception.LyException;
import com.leyou.common.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Auther: ShiTianhang
 * @Date: 2019/7/31 08:51
 * @Description:
 */
@ControllerAdvice
//@RestControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(LyException.class)
    public ResponseEntity<ExceptionResult> handleException(LyException e) {
        return ResponseEntity.status(e.getExceptionEnum().getCode()).body(new ExceptionResult(e.getExceptionEnum()));
    }
}
