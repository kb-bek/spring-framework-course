package org.kubanych.spring.spring_07_annotation_intro;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        		"applicationContext.xml"
        		);
        
        Music music = context.getBean("classicalMusic", Music.class);
        MusicPlayer classicalmusicPlayer = new MusicPlayer(music);
        classicalmusicPlayer.playMusic();
        
        Music music2 = context.getBean("rockMusic", Music.class);
        MusicPlayer rockMusicPlayer = new MusicPlayer(music2);
        rockMusicPlayer.playMusic();
        
        Music music3 = context.getBean("jazzMusic", Music.class);
        MusicPlayer jazzMusicPlayer = new MusicPlayer(music3);
        jazzMusicPlayer.playMusic();
        
        
        context.close();
    }
}
