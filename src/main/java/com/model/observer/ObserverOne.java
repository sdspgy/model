package com.model.observer;

/**
 * Author:   zhiqiu
 * Date:     2019-10-22
 */
public class ObserverOne implements Observer {

	@Override
	public void update() {
		System.out.println("observerOne!");
	}
}
