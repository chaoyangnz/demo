package com.example;

import io.micronaut.context.annotation.Value;

import javax.inject.Singleton;

@Singleton
public class BeanWithConstructor {
	private final String configProp;
	public BeanWithConstructor(@Value("${a.b}") String configProp) {
		this.configProp = configProp;
	}

	public void printThis() {
		System.out.println(this.configProp);
	}
}
