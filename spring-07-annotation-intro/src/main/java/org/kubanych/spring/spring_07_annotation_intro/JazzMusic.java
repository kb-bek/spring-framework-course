package org.kubanych.spring.spring_07_annotation_intro;
import org.springframework.stereotype.Component;


@Component
public class JazzMusic implements Music{
	@Override
	public String getSong() {
		return "I've Been Waiting All My Life";
	}
}
