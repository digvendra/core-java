package com.core.practise.serialization.sameorderdeserialization;

import java.io.Serializable;

public class Cat implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5346018532149923380L;

	String name = "Cat";

	public String toString() {
		return this.name;
	}

}
