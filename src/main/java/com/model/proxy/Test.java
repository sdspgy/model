package com.model.proxy;

/**
 * Author:   zhiqiu
 * Date:     2019-10-22
 */
public class Test {
	//静态代理
	public static void main(String[] args) {
		//目标对象
		ISinger target = new Singer();
		//代理对象
		ISinger proxy = new SingerProxy(target);
		//执行的是代理的方法
		proxy.sing();
	}
}