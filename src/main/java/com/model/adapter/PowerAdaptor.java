package com.model.adapter;

/**
 * Author:   zhiqiu
 * Date:     2019-09-05
 */
public class PowerAdaptor implements JP110VInterface {

	private CN220VInterface cn220VInterface;

	public PowerAdaptor(CN220VInterface cn220VInterface) {
		this.cn220VInterface = cn220VInterface;
	}

	@Override
	public void connect() {
		cn220VInterface.connect();
	}

}
