package com.model.singleton;

/**
 * Author:   zhiqiu
 * Date:     2019-09-09
 */
public class SingletonHungry {

	// 饿汉式
	private final static SingletonHungry singletonHungry = new SingletonHungry();

	private SingletonHungry() {
	}

	// 务必使用static声明为类所属方法
	public static SingletonHungry getInstance() {
		return singletonHungry;
	}
}
