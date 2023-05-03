package com.course.service;

import com.course.dto.LoginFormDTO;
import com.course.dto.Result;
import com.course.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zx
 * @since 2023-04-18
 */
public interface UserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);
}
