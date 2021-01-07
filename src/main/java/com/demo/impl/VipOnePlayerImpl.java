package com.demo.impl;

import com.demo.Award;
import com.demo.SendAward;

import java.util.List;

public class VipOnePlayerImpl implements SendAward {

    @Override
    public void sengAward(List<Award> awards) {
        System.out.println("----------Vip_1玩家周奖励发送成功----------");
        awards.parallelStream().forEach(item -> {
            System.out.println(item);
        });

    }
}