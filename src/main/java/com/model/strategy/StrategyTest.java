package com.model.strategy;

/**
 * Author:   zhiqiu
 * Date:     2019-09-05
 */
public class StrategyTest {

	public static void main(String[] args) {
		Context context = null;

		Strategy strategyA = new StrategyA();
		context = new Context(strategyA);
		context.algorithmInterface();

		Strategy strategyB = new StrategyB();
		context = new Context(strategyB);
		context.algorithmInterface();

		Strategy strategyC = new StrategyC();
		context = new Context(strategyC);
		context.algorithmInterface();
	}

}
