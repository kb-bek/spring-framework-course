package org.kubanych.spring.spring_07_annotation_intro;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
	@Override
	public String getSong() {
		return "Moonlight Sonata";
	}
}
