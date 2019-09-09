package com.model.factory;

import java.util.Map;

/**
 * Author:   zhiqiu
 * Date:     2019-09-09
 */
public enum FactoryType {

	ONE("01", "ONE") {
		@Override
		public Map batch(Map<String, Object> parm) {
			return null;
		}
	},
	TWO("02", "TWO") {
		@Override
		public Map batch(Map<String, Object> parm) {
			return null;
		}
	};

	private String code;
	private String type;

	FactoryType(String code, String type) {
		this.code = code;
		this.type = type;
	}

	public abstract Map batch(Map<String, Object> parm);

	public static FactoryType getInstanceByCode(String code) {
		for (FactoryType factoryType : FactoryType.values()) {
			if (factoryType.code.equals(code)) {
				return factoryType;
			}
		}
		return null;
	}
}
