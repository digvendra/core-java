package com.core.practise.serialization.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationBasicDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d = new Dog();

		// Serialization basic
		FileOutputStream fos = new FileOutputStream("serialization.basic.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Dog.id = "desi1";
		oos.writeObject(d);

		// DeSerialization basic
		FileInputStream fis = new FileInputStream("serialization.basic.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog.id = "desi2";
		Dog d1 = (Dog) ois.readObject();
		Dog.id = "desi3";
		System.out.println(d1);
	}

}
