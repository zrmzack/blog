package com.zrm.service;

import com.zrm.po.User;

public interface UserService {
    User checkUser(String username,String password);
}
