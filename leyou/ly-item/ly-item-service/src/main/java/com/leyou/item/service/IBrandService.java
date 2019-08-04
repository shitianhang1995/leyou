package com.leyou.item.service;

import com.leyou.common.vo.PageResult;
import com.leyou.item.pojo.Brand;

/**
 * @Auther: ShiTianhang
 * @Date: 2019/8/4 18:29
 * @Description:
 */
public interface IBrandService {


    PageResult<Brand> querBrandByPage(Integer page, Integer rows, String sortBy, Boolean desc, String key);
}
