package com.model.adapter;

/**
 * Author:   zhiqiu
 * Date:     2019-09-05
 */
public class ElectricCooker {

	private JP110VInterface jp110VInterface;//日本电饭煲

	//这里必须传日本110V的接口进来
	ElectricCooker(JP110VInterface jp110VInterface) {
		this.jp110VInterface = jp110VInterface;
	}

	public void cook() {
		jp110VInterface.connect();
		System.out.println("开始做饭了..");
	}
}
