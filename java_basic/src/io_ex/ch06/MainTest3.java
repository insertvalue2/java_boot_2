package io_ex.ch06;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MainTest3 {

	public static void main(String[] args) {
		Class c3 = null;
		try {
			c3 = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Constructor<String>[] cons = c3.getConstructors();
		for (Constructor con : cons) {
			System.out.println(con);
		}

		System.out.println();

		Method[] methods = c3.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}

	}
}
