package com.course.service.impl;

import com.course.entity.Sign;
import com.course.mapper.SignMapper;
import com.course.service.SignService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zx
 * @since 2023-04-18
 */
@Service
public class SignServiceImpl extends ServiceImpl<SignMapper, Sign> implements SignService {

}
