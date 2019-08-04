package com.leyou.item.controller;

import com.leyou.common.vo.PageResult;
import com.leyou.item.pojo.Brand;
import com.leyou.item.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ShiTianhang
 * @Date: 2019/8/4 18:31
 * @Description:
 */
@RestController
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private IBrandService brandService;

    @GetMapping("page")
    public ResponseEntity<PageResult<Brand>> querBrandByPage(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "5") Integer rows,
            @RequestParam(value = "sortBy", defaultValue = "false") String sortBy,
            @RequestParam(value = "desc", defaultValue = "false") Boolean desc,
            @RequestParam(value = "key", required = false) String key

    ) {
        return ResponseEntity.ok(brandService.querBrandByPage(page, rows, sortBy, desc, key));
    }
}
