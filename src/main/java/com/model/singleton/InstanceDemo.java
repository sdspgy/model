package com.model.singleton;

/**
 * Author:   zhiqiu
 * Date:     2019-09-09
 */
public class InstanceDemo {

	private InstanceDemo() {

	}

	public static InstanceDemo getInstance() {
		return Singleton.INSTANCE.getInstance();
	}

	/**
	 * 使用枚举方法实现单例模式
	 */
	private enum Singleton {
		INSTANCE;

		private InstanceDemo instance;

		/**
		 * JVM保证这个方法绝对只调用一次
		 */
		Singleton() {
			instance = new InstanceDemo();
		}

		public InstanceDemo getInstance() {
			return instance;
		}
	}
}
