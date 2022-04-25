package task.app;

import task.service.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void run() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
//        System.out.println(rockMusic.getSong());
//
//        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());

//        Music music = context.getBean("ClassicalMusic", Music.class);
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(music);




        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close();

        context.close();
    }
}
