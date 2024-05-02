package org.example;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{

	private String[] songs = new String[3];
	{
		songs[0] = "Moonlight Sonata";
		songs[1] = "Experience";
		songs[2] = "Una Mattina";
	}


	@Override
	public String[] getSongs() {
		return songs;
	}
}
