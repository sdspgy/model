package com.model.singleton;

/**
 * Author:   zhiqiu
 * Date:     2019-09-09
 */
public class Singleton {

	// 懒汉式
	// 延迟加载保证多线程安全
	private volatile static Singleton singleton;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

}
