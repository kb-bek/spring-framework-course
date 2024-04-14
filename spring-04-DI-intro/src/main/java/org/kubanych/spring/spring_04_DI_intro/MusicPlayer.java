package org.kubanych.spring.spring_04_DI_intro;

import java.util.*; 

public class MusicPlayer {
	private Music music;
	
	private List<Music> musics = new ArrayList<>();
	private String name;
	private int volume;
	
	//Dependency injection with constructor
	/*
	public MusicPlayer(Music music) {
		this.music = music;
	}
	*/
	
	public MusicPlayer() {}
	
	public void setMusic(Music music) {
		this.music = music;
	}
	
	public void setMusics(List<Music> musics) {
		this.musics = musics;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void playOneMusic() {
		System.out.println("Playing: " + music.getSong());
	}
	
	public void playMusics() {
		
		for (Music music : musics) {
			System.out.println("Playing: " + music.getSong());
		}
	}
}