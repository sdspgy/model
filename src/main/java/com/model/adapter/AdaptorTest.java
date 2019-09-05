package com.model.adapter;

/**
 * Author:   zhiqiu
 * Date:     2019-09-05
 */
public class AdaptorTest {

	public static void main(String[] args) {
		CN220VInterface cn220VInterface = new CN220VInterfaceImpl();
		PowerAdaptor powerAdaptor = new PowerAdaptor(cn220VInterface);
		//电饭煲
		ElectricCooker cooker = new ElectricCooker(powerAdaptor);
		cooker.cook();//使用了适配器,在220V的环境可以工作了

	}
}
