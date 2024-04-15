package org.kubanych.spring.spring_05_scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        		"applicationContext.xml"
        		);
        
        
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        
        boolean comparison = firstMusicPlayer == secondMusicPlayer;
        
        System.out.println(comparison);
        
        firstMusicPlayer.setVolume(20);
        
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
        
        context.close();
    }
}
