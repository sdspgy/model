package com.model.builder;

/**
 * Author:         知秋
 * CreateDate:     2019-09-05
 */
public class PersonDirector {
	//一定要按顺序
	public Person constructPerson(PersonBuilder pb) {
		pb.builderHead();
		pb.builderBody();
		pb.builderFoot();
		return pb.builderPerson();
	}
}
