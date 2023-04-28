package com.course.service.impl;

import com.course.entity.SeckillVoucher;
import com.course.mapper.SeckillVoucherMapper;
import com.course.service.SeckillVoucherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 秒杀优惠券表，与优惠券是一对一关系 服务实现类
 * </p>
 *
 * @author zx
 * @since 2023-04-18
 */
@Service
public class SeckillVoucherServiceImpl extends ServiceImpl<SeckillVoucherMapper, SeckillVoucher> implements SeckillVoucherService {

}
