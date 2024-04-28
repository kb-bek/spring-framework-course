package org.kubanych.spring.spring_07_annotation_intro;
import org.springframework.stereotype.Component;


@Component
public class RockMusic implements Music {
	@Override
	public String getSong() {
		return "Linkin Park";
	}
}
