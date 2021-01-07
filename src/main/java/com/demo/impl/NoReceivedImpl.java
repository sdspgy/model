package com.demo.impl;

import com.demo.State;

public class NoReceivedImpl implements State {
    @Override
    public void awardState() {
        System.out.println("-----------未领取奖励----------");
    }
}
