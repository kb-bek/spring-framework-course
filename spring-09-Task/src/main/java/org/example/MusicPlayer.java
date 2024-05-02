package org.example;

import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

	private ClassicalMusic classicalMusic;
	private RockMusic rockMusic;
	private JazzMusic jazzMusic;

	@Autowired
	public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, JazzMusic jazzMusic){
		this.classicalMusic = classicalMusic;
		this.rockMusic = rockMusic;
		this.jazzMusic = jazzMusic;
	}

	public void playMusic(MusicGenre genre) {
		Random random = new Random();

		int randomNumber = random.nextInt(3);

		switch (genre) {
			case CLASSICAL -> System.out.println(classicalMusic.getSongs()[randomNumber]) ;
			case JAZZ -> System.out.println(jazzMusic.getSongs()[randomNumber]);
			case ROCK -> System.out.println(rockMusic.getSongs()[randomNumber]);
		}

	}
}
