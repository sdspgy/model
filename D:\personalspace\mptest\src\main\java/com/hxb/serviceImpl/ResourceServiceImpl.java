package com.hxb.serviceImpl;

import com.hxb.entity.Resource;
import com.hxb.mapper.ResourceMapper;
import com.hxb.service.ResourceService;
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
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements ResourceService {

}
