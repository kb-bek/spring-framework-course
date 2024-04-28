package org.kubanych.spring.spring_07_annotation_intro;

public class MusicPlayer {
	private Music music;
	
	public MusicPlayer(Music music) {
		this.music = music;
	}
	
	public void playMusic() {
		System.out.println("Playing: " + music.getSong());
	}
}
