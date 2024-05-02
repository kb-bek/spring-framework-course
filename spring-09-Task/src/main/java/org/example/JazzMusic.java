package org.example;
import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music{
	private String[] songs = new String[3];
	{
		songs[0] = "Fly Me to the Moon";
		songs[1] = "Black Hills of Dakota";
		songs[2] = "Don't Know Why";
	}

	@Override
	public String[] getSongs() {
		return songs;
	}
}
