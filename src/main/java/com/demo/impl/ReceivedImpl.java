package com.demo.impl;

import com.demo.State;

public class ReceivedImpl implements State {
    @Override
    public void awardState() {
        System.out.println("------------已领取奖励--------");
    }
}
