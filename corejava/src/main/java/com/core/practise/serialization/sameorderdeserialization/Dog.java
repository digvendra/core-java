package com.core.practise.serialization.sameorderdeserialization;

import java.io.Serializable;

public class Dog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1307048160858353178L;

	String name = "Dog";

	public String toString() {
		return this.name;
	}

}
