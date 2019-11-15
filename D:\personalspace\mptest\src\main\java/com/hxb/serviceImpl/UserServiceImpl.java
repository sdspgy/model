package com.hxb.serviceImpl;

import com.hxb.entity.User;
import com.hxb.mapper.UserMapper;
import com.hxb.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yshexiaobai
 * @since 2019-10-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
