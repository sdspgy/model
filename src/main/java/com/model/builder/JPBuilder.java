package com.model.builder;

/**
 * Author:         知秋
 * CreateDate:     2019-09-05
 */
public class JPBuilder implements PersonBuilder {

	private Person person;

	public JPBuilder() {
		person = new Person();//创建一个Person实例,用于调用set方法
	}

	@Override
	public void builderHead() {
		person.setHead("日本人黑眼睛 圆脸");

	}

	@Override
	public void builderBody() {
		person.setBody("体格小");

	}

	@Override
	public void builderFoot() {
		person.setFoot("腿短");

	}

	@Override
	public Person builderPerson() {
		return person;
	}
}
