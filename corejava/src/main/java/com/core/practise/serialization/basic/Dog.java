package com.core.practise.serialization.basic;

import java.io.Serializable;

public class Dog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2860569601050585318L;

	String name = "Desi";

	String owner = "street";

	static String id = "desi";

	public String toString() {
		return "name = " + this.name + ", owner = " + this.owner + ", id = " + this.id;
	}

}
