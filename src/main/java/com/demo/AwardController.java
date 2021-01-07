package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class AwardController {

    private static Random r = null;

    private static Random getR() {
        if (r == null) {
            r = new Random();
        }
        return r;
    }

    public static void getAward() {

        StateContext stateContext = new StateContext();
        stateContext.getState();

        String tig = "";
        tig = "noneVip";
//        tig = "vipOne";
//        tig = "vipTwo";
//        tig = "vipThree";

        System.out.println("-----------构建玩家的奖品----------");
        List<Award> awards = new ArrayList<>();
        Award award = null;
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
                award = new Award();
                award.setAwardId(getR().nextInt(1000));
                award.setAwardName(i % 2 == 0 ? "传说" : "神话");
                award.setAwardNum(getR().nextInt(10));
                awards.add(award);
                System.out.println(award.toString());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        StrategyType instanceStrategyType = StrategyType.getInstanceByTig(tig);
        if (Objects.isNull(instanceStrategyType))
            throw new RuntimeException("none the type");

        SendAward sendAwardImpl = instanceStrategyType.getPlayerImpl();
        sendAwardImpl.sengAward(awards);

        stateContext.changeSendingAward();
        stateContext.getState();

        stateContext.changeReceived();
        stateContext.getState();
    }

    public static void main(String[] args) {
        getAward();
    }
}
