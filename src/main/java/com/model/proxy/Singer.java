package com.model.proxy;

/**
 * Author:   zhiqiu
 * Date:     2019-10-22
 */

/**
 * 目标对象实现了某一接口
 */
public class Singer implements ISinger {

	@Override
	public void sing() {
		System.out.println("唱一首歌");
	}
}
