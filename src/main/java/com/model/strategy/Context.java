package com.model.strategy;

/**
 * Author:   zhiqiu
 * Date:     2019-09-05
 */
public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void algorithmInterface() {
		strategy.algorithmInterface();
	}
}

