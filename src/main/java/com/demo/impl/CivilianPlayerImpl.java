package com.demo.impl;

import com.demo.Award;
import com.demo.SendAward;

import java.util.List;

public class CivilianPlayerImpl implements SendAward {

    @Override
    public void sengAward(List<Award> awards) {
        System.out.println("----------平民玩家周奖励发送成功----------");
        awards.forEach(System.out::println);

    }
}
