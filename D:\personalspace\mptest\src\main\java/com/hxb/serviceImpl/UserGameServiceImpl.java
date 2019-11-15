package com.hxb.serviceImpl;

import com.hxb.entity.UserGame;
import com.hxb.mapper.UserGameMapper;
import com.hxb.service.UserGameService;
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
public class UserGameServiceImpl extends ServiceImpl<UserGameMapper, UserGame> implements UserGameService {

}
