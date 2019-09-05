package com.model.adapter;

/**
 * Author:         知秋
 * CreateDate:     2019-09-05
 */
public class CN220VInterfaceImpl implements CN220VInterface {

	@Override
	public void connect() {
		System.out.println("中国220V,接通电源,开始工作");
	}
}
