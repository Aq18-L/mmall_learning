package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by Actor on 2018/3/31.
 */
public interface IUserService {
    ServerResponse<User> login(String username, String password);
}
