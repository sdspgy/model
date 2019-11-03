package com.model.observer;

/**
 * Author:   zhiqiu
 * Date:     2019-10-22
 */
public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("update self!");
		notifyObservers();
	}

}