package com.demo;

import com.demo.impl.NoReceivedImpl;
import com.demo.impl.ReceivedImpl;
import com.demo.impl.SendingAwardImpl;

public class StateContext {

    private State state = new NoReceivedImpl();

    public void changeSendingAward() {
        this.state = new SendingAwardImpl();
    }

    public void changeReceived() {
        this.state = new ReceivedImpl();
    }

    public void getState() {
        state.awardState();
    }
}
