package com.model.appearance;

/**
 * Author:   zhiqiu
 * Date:     2019-09-05
 */
public class Computer {

	EmailMsgService emailMsgService;
	SmsMsgService smsMsgService;
	WechatMsgService wechatMsgService;

	public Computer() {
		emailMsgService = new EmailMsgServiceImpl();
		smsMsgService = new SmsMsgServiceImpl();
		wechatMsgService = new WechatMsgServiceImpl();
	}

	public void sendMsg() {
		emailMsgService.sendMsg();
		smsMsgService.sendMsg();
		wechatMsgService.sendMsg();
	}

}
