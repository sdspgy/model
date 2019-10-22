package com.model.proxy;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * Author:   zhiqiu
 * Date:     2019-10-22
 */
public class Test2 {

	//动态代理（jdk代理）
	public static void main(String[] args) {
		Singer target = new Singer();
		ISinger proxy = (ISinger) Proxy.newProxyInstance(
						target.getClass().getClassLoader(),//指定当前目标对象使用类加载器，写法固定
						target.getClass().getInterfaces(),//目标对象实现的接口的类型，写法固定
						new InvocationHandler() {//事件处理接口，需传入一个实现类，一般直接使用匿名内部类

							@Override
							public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
								System.out.println("向观众问好");
								Object returnValue = method.invoke(target, objects);
								System.out.println("谢谢大家");
								return returnValue;
							}
						});
		proxy.sing();
	}
}
