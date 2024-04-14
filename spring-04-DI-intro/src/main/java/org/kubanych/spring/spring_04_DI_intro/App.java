package org.kubanych.spring.spring_04_DI_intro;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        		"applicationContext.xml"
        		);
        
        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        
        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        
        musicPlayer.playOneMusic();
        musicPlayer.playMusics();
        
        System.out.println("Music player name: " + musicPlayer.getName());
        System.out.println("Music volume: " + musicPlayer.getVolume());
        
        context.close();
    }
}
