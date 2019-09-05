package com.model.builder;

/**
 * Author:         知秋
 * CreateDate:     2019-09-05
 */
public interface PersonBuilder {

	void builderHead();

	void builderBody();

	void builderFoot();

	Person builderPerson(); //组装
}
