package com.course.mapper;

import com.course.entity.Voucher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zx
 * @since 2023-04-18
 */
@Mapper
public interface VoucherMapper extends BaseMapper<Voucher> {
    List<Voucher> queryVoucherOfShop(@Param("shopId") Long shopId);
}
