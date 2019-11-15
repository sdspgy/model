package com.hxb.serviceImpl;

import com.hxb.entity.Role;
import com.hxb.mapper.RoleMapper;
import com.hxb.service.RoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
