package org.example;
import org.springframework.stereotype.Component;


@Component
public class RockMusic implements Music {

	private String[] songs = new String[3];
	{
		songs[0] = "Sweet Child O' Mine";
		songs[1] = "Born To Be Wild";
		songs[2] = "Eye Of The Tiger";
	}
	@Override
	public String[] getSongs() {
		return songs;
	}
}
