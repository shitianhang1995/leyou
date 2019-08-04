package com.leyou.item.service;

import com.leyou.item.pojo.Category;

import java.util.List;

/**
 * @Auther: ShiTianhang
 * @Date: 2019/8/3 09:52
 * @Description:
 */
public interface ICategoryService {
    List<Category> queryCategoryListByPid(Long pid);
}
