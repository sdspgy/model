package com.model.appearance;

/**
 * Author:   zhiqiu
 * Date:     2019-09-05
 */
public class FacadeTest {

	public static void main(String[] args) {
		/*下面这些就是没有使用外观模式时的调用 */
		//        EmailMsgService emailMsgService = new EmailMsgServiceImpl();
		//        SmsMsgService smsMsgService = new SmsMsgServiceImpl();
		//        WechatMsgService wechatMsgService = new WechatMsgServiceImpl();
		//        emailMsgService.sendMsg();
		//        smsMsgService.sendMsg();
		//        wechatMsgService.sendMsg();
		/* 这是使用了外观模式后的用法，其实就是封装 */
		Computer computer = new Computer();
		computer.sendMsg();
	}

}
