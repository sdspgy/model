package com.model.builder;

/**
 * Author:         知秋
 * CreateDate:     2019-09-05
 */
public class BuilderTest {

	public static void main(String[] args) {
		PersonDirector personDirector = new PersonDirector();
		//建造美国人
		Person person = personDirector.constructPerson(new USBuilder());
		System.out.println(person.getHead());
		System.out.println(person.getBody());
		System.out.println(person.getFoot());
		//建造日本人
		person = personDirector.constructPerson(new JPBuilder());
		System.out.println(person.getHead());
		System.out.println(person.getBody());
		System.out.println(person.getFoot());
	}
}
