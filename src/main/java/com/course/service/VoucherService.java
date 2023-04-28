package com.course.service;

import com.course.dto.Result;
import com.course.entity.Voucher;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zx
 * @since 2023-04-18
 */
public interface VoucherService extends IService<Voucher> {
    Result queryVoucherOfShop(Long shopId);

    void addSeckillVoucher(Voucher voucher);
}
