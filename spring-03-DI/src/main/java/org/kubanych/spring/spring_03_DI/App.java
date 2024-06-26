package org.kubanych.spring.spring_03_DI;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        		"applicationContext.xml"
        		);
        
        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        
        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        
        musicPlayer.playMusic();
        
        context.close();
    }
}
