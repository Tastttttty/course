package com.course.service;

import com.course.dto.Result;
import com.course.entity.Blog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zx
 * @since 2023-04-18
 */
public interface BlogService extends IService<Blog> {

    Result queryBlogById(Long id);

    Result likeBlog(Long id);
}
