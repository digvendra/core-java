package com.core.practise.serialization.sameorderdeserialization;

import java.io.Serializable;

public class Rat implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 814482605359888155L;

	String name = "Rat";

	public String toString() {
		return this.name;
	}

}
