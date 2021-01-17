package com.example;

import io.micronaut.context.annotation.Value;
import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class BeanWithConstructorByLombok {
	@Value("${a.b}")
	private final String configProp;

	public void printThis() {
		System.out.println(this.configProp);
	}
}
