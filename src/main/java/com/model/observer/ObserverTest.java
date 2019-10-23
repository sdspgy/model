package com.model.observer;

/**
 * Author:   zhiqiu
 * Date:     2019-10-22
 */
public class ObserverTest {

	public static void main(String[] args) {
		Subject sub = new MySubject();
		sub.add(new ObserverOne());
		sub.add(new ObserverTwo());

		sub.operation();
	}
}
