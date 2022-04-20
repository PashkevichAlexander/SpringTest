package task.app;

import org.springframework.boot.ApplicationArguments;
import task.service.MusicPlayer;
import task.entity.ClassicalMusic;
import task.entity.RockMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void run() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
//        System.out.println(rockMusic.getSong());
//
//        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer1.playMusic();

        context.close();
    }
}
