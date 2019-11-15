package com.hxb.serviceImpl;

import com.hxb.entity.Games;
import com.hxb.mapper.GamesMapper;
import com.hxb.service.GamesService;
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
public class GamesServiceImpl extends ServiceImpl<GamesMapper, Games> implements GamesService {

}
