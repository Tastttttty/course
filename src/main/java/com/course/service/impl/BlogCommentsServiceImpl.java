package com.course.service.impl;

import com.course.entity.BlogComments;
import com.course.mapper.BlogCommentsMapper;
import com.course.service.BlogCommentsService;
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
public class BlogCommentsServiceImpl extends ServiceImpl<BlogCommentsMapper, BlogComments> implements BlogCommentsService {

}
