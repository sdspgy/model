package com.demo.impl;

import com.demo.State;

public class SendingAwardImpl implements State {
    @Override
    public void awardState() {
        System.out.println("--------发送奖励中----------");
    }
}
