package com.core.practise.serialization.sameorderdeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d = new Dog();
		Cat c = new Cat();
		Rat r = new Rat();

		// Serialization basic
		FileOutputStream fos = new FileOutputStream("serialization.basic.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.writeObject(c);
		oos.writeObject(r);

		// DeSerialization basic
		FileInputStream fis = new FileInputStream("serialization.basic.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d1 = (Dog) ois.readObject();
		Cat c1 = (Cat) ois.readObject();
		Rat r1 = (Rat) ois.readObject();
		System.out.println(d1);
		System.out.println(c1);
		System.out.println(r1);
	}

}
