package com.demo;

import com.demo.impl.CivilianPlayerImpl;
import com.demo.impl.VipOnePlayerImpl;
import com.demo.impl.VipThreePlayerImpl;
import com.demo.impl.VipTwoPlayerImpl;

public enum StrategyType {

    NONEVIP("noneVip") {
        @Override
        public SendAward getPlayerImpl() {
            return new CivilianPlayerImpl();
        }
    },
    VIPONE("vipOne") {
        @Override
        public SendAward getPlayerImpl() {
            return new VipOnePlayerImpl();
        }
    },
    VIPTWO("vipTwo") {
        @Override
        public SendAward getPlayerImpl() {
            return new VipTwoPlayerImpl();
        }
    },
    VIPTHREE("vipThree") {
        @Override
        public SendAward getPlayerImpl() {
            return new VipThreePlayerImpl();
        }
    };

    StrategyType(String tig) {
        this.tig = tig;
    }

    private String tig;

    public abstract SendAward getPlayerImpl();

    public static StrategyType getInstanceByTig(String tig) {
        for (StrategyType strategyType : StrategyType.values()) {
            if (strategyType.tig.equals(tig)) {
                return strategyType;
            }
        }
        return null;
    }
}
