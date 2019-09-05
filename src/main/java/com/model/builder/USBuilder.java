package com.model.builder;

/**
 * Author:         知秋
 * CreateDate:     2019-09-05
 */
public class USBuilder implements PersonBuilder {

	private Person person;

	public USBuilder() {
		person = new Person();//创建一个Person实例,用于调用set方法
	}

	@Override
	public void builderHead() {
		person.setHead("美国蓝眼睛 长脸 尖鼻");
	}

	@Override
	public void builderBody() {
		person.setBody("体格大");
	}

	@Override
	public void builderFoot() {
		person.setFoot("腿长");
	}

	@Override
	public Person builderPerson() {
		return person;
	}

}
