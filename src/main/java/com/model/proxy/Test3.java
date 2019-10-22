package com.model.proxy;

/**
 * Author:   zhiqiu
 * Date:     2019-10-22
 */
public class Test3 {

	//Cglib代理
	public static void main(String[] args) {
		//目标对象
		Writer target = new Writer();
		//代理对象
		Writer proxy = (Writer) new ProxyFactory(target).getProxyInstance();
		proxy.write();
	}
}
