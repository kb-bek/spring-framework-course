package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
//	@Autowired
	private ClassicalMusic classicalMusic;
	private RockMusic rockMusic;
	private JazzMusic jazzMusic;


	@Autowired
	public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, JazzMusic jazzMusic) {
		this.classicalMusic = classicalMusic;
		this.rockMusic = rockMusic;
		this.jazzMusic = jazzMusic;
	}

//	@Autowired
//	public void setClassicalMusic(ClassicalMusic classicalMusic) {
//		this.classicalMusic = classicalMusic;
//	}


	public String playMusic() {
		return "Playing: " + classicalMusic.getSong();
	}
}
