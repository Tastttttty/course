package com.course.service;

import com.course.dto.Result;
import com.course.entity.Shop;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zx
 * @since 2023-04-18
 */
public interface ShopService extends IService<Shop> {

    Result queryById(Long id);

    Result update(Shop shop);

}
